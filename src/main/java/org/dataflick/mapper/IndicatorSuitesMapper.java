package org.dataflick.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.entity.IndicatorEntity;
import org.dataflick.entity.IndicatorSuitesEntity;
import org.dataflick.model.indicators.Indicator;
import org.dataflick.model.indicators.suites.IndicatorSuites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class IndicatorSuitesMapper implements Mapper<IndicatorSuites, IndicatorSuitesEntity> {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private IndicatorMapper indicatorMapper;

    @Override
    public IndicatorSuites toModel(IndicatorSuitesEntity indicatorSuitesEntity) throws JsonProcessingException {
        IndicatorSuites suites = new IndicatorSuites();
        suites.setId(indicatorSuitesEntity.getId());
        suites.setName(indicatorSuitesEntity.getName());

        Set<Indicator> indicatorSet = new HashSet<>();
        for (IndicatorEntity indicator: indicatorSuitesEntity.getIndicators()) {
            indicatorSet.add(indicatorMapper.toModel(indicator));
        }

        suites.setIndicators(indicatorSet);
        suites.setIsActive(indicatorSuitesEntity.isIsActive());
        suites.setIsDefault(indicatorSuitesEntity.isIsDefault());
        return suites;
    }

    @Override
    public IndicatorSuitesEntity toEntity(IndicatorSuites indicatorSuites) throws JsonProcessingException {
        IndicatorSuitesEntity entity = new IndicatorSuitesEntity();
        entity.setId(indicatorSuites.getId());
        entity.setName(indicatorSuites.getName());

        Set<IndicatorEntity> indicatorEntitySet = new HashSet<>();
        for (Indicator indicator: indicatorSuites.getIndicators()) {
            indicatorEntitySet.add(indicatorMapper.toEntity(indicator));
        }
        entity.setIndicators(indicatorEntitySet);
        entity.setIsActive(indicatorSuites.isIsActive());
        entity.setIsDefault(indicatorSuites.isIsDefault());
        return entity;
    }
}
