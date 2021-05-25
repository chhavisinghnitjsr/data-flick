package org.dataflick.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.dataflick.entity.IndicatorEntity;
import org.dataflick.mapper.IndicatorMapper;
import org.dataflick.model.indicators.Indicator;
import org.dataflick.repository.IndicatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndicatorService {

    @Autowired
    private IndicatorMapper mapper;

    @Autowired
    private IndicatorRepository indicatorRepository;

    public Indicator save(Indicator indicator) throws JsonProcessingException {
        IndicatorEntity indicatorEntity = mapper.toEntity(indicator);
        indicatorEntity = indicatorRepository.saveAndFlush(indicatorEntity);
        return mapper.toModel(indicatorEntity);
    }

    public List<Indicator> getIndicators() {
        return null;
    }

    public List<Indicator> deleteIndicators(String indicatorName) {
        return null;
    }
}
