package org.dataflick.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.controller.request.IndicatorSuitesRequest;
import org.dataflick.model.indicators.suites.IndicatorSuites;
import org.dataflick.service.IndicatorSuitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IndicatorSuitesController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private IndicatorSuitesService indicatorSuitesService;

    @PostMapping("/indicator-suites")
    public IndicatorSuites createDataSource(@RequestBody IndicatorSuitesRequest indicatorSuites) throws Exception {
        return indicatorSuitesService.save(indicatorSuites);
    }

    @GetMapping("/indicator-suites")
    public List<IndicatorSuites> getIndicators() throws JsonProcessingException {
        List<IndicatorSuites> indicatorSuites = indicatorSuitesService.getIndicators();
        return indicatorSuites;
    }

    @PutMapping("/indicator-suites")
    public List<IndicatorSuites> deleteIndicators(String indicatorName) throws JsonProcessingException {
        List<IndicatorSuites> indicatorSuite = indicatorSuitesService.deleteIndicators(indicatorName);
        return indicatorSuite;
    }
}