package org.dataflick.service;

import org.dataflick.entity.DataSourceEntity;
import org.dataflick.model.DataSource;
import org.dataflick.repository.DataSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSourceService {

    @Autowired
    private DataSourceRepository dataSourceRepository;

    public DataSourceEntity save(DataSource request) {
        DataSourceEntity entity = mapper(request);
        entity = dataSourceRepository.save(entity);
        System.out.println("We received the datasource request successfully");
        System.out.println("The datasource is: ");
        return entity;
    }

    private DataSourceEntity mapper(DataSource request) {
        DataSourceEntity entity = new DataSourceEntity();
        entity.setDbSystem(request.getDbSystem());
        entity.setName(request.getName());
        entity.setPassword(request.getPassword());
        entity.setType(request.getSourceType());
        entity.setUrl(request.getUrl());
        entity.setUserid(request.getUser());
        return entity;
    }

}





