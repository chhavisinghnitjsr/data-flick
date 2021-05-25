package org.dataflick.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.dataflick.entity.DataSourceEntity;
import org.dataflick.mapper.DataSourceMapper;
import org.dataflick.model.datasource.DataSource;
import org.dataflick.model.datasource.DbParams;
import org.dataflick.repository.DataSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataSourceService {

    @Autowired
    private DataSourceRepository dataSourceRepository;

    @Autowired
    private DataSourceMapper mapper;

    public DataSource save(DataSource request) throws JsonProcessingException {
        System.out.println("DatasourceService->save: coming request to save datasource" + request);
        DataSourceEntity entity = mapper.toEntity(request);
        entity = dataSourceRepository.save(entity);
        return mapper.toModel(entity);
    }

    private DataSourceEntity mapper(DataSource request) {
        DataSourceEntity entity = new DataSourceEntity();
        entity.setName(request.getName());
        entity.setUrl(request.getUrl());

        DbParams dbParams = new DbParams();

        return entity;
    }

    public List<DataSource> getDataSources() throws JsonProcessingException {
        List<DataSourceEntity> dataSources = dataSourceRepository.findAll();
        List<DataSource> collect = new ArrayList<>();
        DataSourceMapper dataSourceMapper = mapper;
        for (DataSourceEntity dataSource : dataSources) {
            DataSource source = dataSourceMapper.toModel(dataSource);
            collect.add(source);
        }

        return collect;
    }
}





