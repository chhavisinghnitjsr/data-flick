package org.dataflick.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.core.Type;
import org.dataflick.entity.DataSourceEntity;
import org.dataflick.model.datasource.DataSource;
import org.dataflick.model.datasource.DbParams;
import org.dataflick.model.datasource.FileParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataSourceMapper implements Mapper<DataSource, DataSourceEntity> {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public DataSource toModel(DataSourceEntity entity) throws JsonProcessingException {
        DataSource dataSource = new DataSource();

        dataSource.setId(entity.getId());
        dataSource.setUrl(entity.getUrl());
        dataSource.setName(entity.getName());

        if (Type.DATABASE.equals(entity.getType())) {
            DbParams dbParams = new DbParams();
            dbParams = objectMapper.readValue(entity.getParams(), DbParams.class);
            dataSource.setParams(dbParams);
        } else {
            FileParams fileParams = new FileParams();
            fileParams = objectMapper.readValue(entity.getParams(), FileParams.class);
            dataSource.setParams(fileParams);
        }
        dataSource.setType(entity.getType());
        dataSource.setFormat(entity.getFormat());
        return dataSource;
    }

    @Override
    public DataSourceEntity toEntity(DataSource dataSource) throws JsonProcessingException {
        DataSourceEntity entity = new DataSourceEntity();

        entity.setUrl(dataSource.getUrl());
        entity.setName(dataSource.getName());
        entity.setParams(objectMapper.writeValueAsString(dataSource.getParams()));
        entity.setType(dataSource.getType());
        entity.setFormat(dataSource.getFormat());
        return entity;
    }
}
