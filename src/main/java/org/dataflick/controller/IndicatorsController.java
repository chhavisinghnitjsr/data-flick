package org.dataflick.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.model.indicators.Indicator;
import org.dataflick.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IndicatorsController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private IndicatorService indicatorService;

    @PostMapping("/indicators")
    public Indicator createDataSource(@RequestBody Indicator indicator) throws Exception {
        return indicatorService.save(indicator);
    }

    @GetMapping("/indicators")
    public List<Indicator> getIndicators() throws JsonProcessingException {
        List<Indicator> indicators = indicatorService.getIndicators();
        return indicators;
    }

    @PutMapping("/indicators")
    public List<Indicator> deleteIndicators(String indicatorName) throws JsonProcessingException {
        List<Indicator> indicator = indicatorService.deleteIndicators(indicatorName);
        return indicator;
    }
}