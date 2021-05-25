package org.dataflick.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.controller.request.DataSourceRequest;
import org.dataflick.core.Type;
import org.dataflick.model.datasource.DataSource;
import org.dataflick.model.datasource.DbParams;
import org.dataflick.model.datasource.FileParams;
import org.dataflick.service.DataSourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DataSourceController {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceController.class);


    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private DataSourceService dataSourceService;

    //we goto under a function by using "control(ctrl)+left keypress"
    @PostMapping("/data-source")
    public DataSource createDataSource(@RequestBody DataSourceRequest request) throws Exception {
        logger.error("received datasource request {}", request);
        DataSource dataSource = new DataSource();

        dataSource.setName(request.getName());
        dataSource.setUrl(request.getUrl());
        dataSource.setType(request.getType());
        dataSource.setFormat(request.getFormat());

        if (Type.DATABASE.equals(request.getType())) {
            DbParams dbParams = new DbParams();
            String json = objectMapper.writeValueAsString(request.getParams());
            dbParams = objectMapper.readValue(json, DbParams.class);
            dataSource.setParams(dbParams);
        } else if (Type.FILE.equals(request.getType())) {
            FileParams fileParams = new FileParams();
            String json = objectMapper.writeValueAsString(request.getParams());
            fileParams = objectMapper.readValue(json, FileParams.class);
            dataSource.setParams(fileParams);
        } else {
            throw new Exception("Only File & Database are supported for type !!");
        }

        return dataSourceService.save(dataSource);
    }

    @GetMapping("/data-source")
    public List<DataSource> getDataSources() throws JsonProcessingException {
        List<DataSource> dataSources = dataSourceService.getDataSources();
        return dataSources;
    }

    @PutMapping("/data-source")
    public List<DataSource> deleteDataSource() throws JsonProcessingException {
        List<DataSource> dataSources = dataSourceService.getDataSources();
        return dataSources;
    }
}