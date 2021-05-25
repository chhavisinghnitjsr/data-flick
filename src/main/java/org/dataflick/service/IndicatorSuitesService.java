package org.dataflick.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.dataflick.controller.request.IndicatorSuitesRequest;
import org.dataflick.entity.IndicatorEntity;
import org.dataflick.entity.IndicatorSuitesEntity;
import org.dataflick.mapper.IndicatorSuitesMapper;
import org.dataflick.model.indicators.Indicator;
import org.dataflick.model.indicators.suites.IndicatorSuites;
import org.dataflick.repository.IndicatorRepository;
import org.dataflick.repository.IndicatorSuitesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class IndicatorSuitesService {

    @Autowired
    private IndicatorSuitesMapper mapper;

    @Autowired
    private IndicatorRepository indicatorRepository;

    @Autowired
    private IndicatorSuitesRepository suitesRepository;

    public IndicatorSuites save(IndicatorSuitesRequest indicatorSuitesRequest) throws JsonProcessingException {

        IndicatorSuites indicatorSuites = new IndicatorSuites();

        Set<IndicatorEntity> indicators = new HashSet<>();
        for (String indicator: indicatorSuitesRequest.getIndicators()) {
            Optional<IndicatorEntity> indicatorEntity = indicatorRepository.findByName(indicator);
            indicatorEntity.ifPresent(indicators::add);
        }

        IndicatorSuitesEntity entity = mapper.toEntity(indicatorSuites);
        entity.setIndicators(indicators);

        entity = suitesRepository.saveAndFlush(entity);
        return mapper.toModel(entity);
    }

    public List<IndicatorSuites> getIndicators() {
        return null;
    }

    public List<IndicatorSuites> deleteIndicators(String suitesName) {
        return null;
    }
}
