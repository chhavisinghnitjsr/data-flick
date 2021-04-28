package org.dataflick.controller;
import org.dataflick.entity.DataSourceEntity;
import org.dataflick.model.DataSource;
import org.dataflick.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataSourceController {
    @Autowired
    private DataSourceService dataSourceService;
    //we goto under a function by using "control(ctrl)+left keypress"
    @PostMapping("/data-source")
    public DataSourceEntity createDataSource(@RequestBody DataSource request) {
        System.out.println("We received the request");
        System.out.println("The data is:  ");
        DataSourceEntity save = dataSourceService.save(request);
        return save;
    }
}