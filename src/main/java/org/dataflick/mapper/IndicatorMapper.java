package org.dataflick.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dataflick.entity.IndicatorEntity;
import org.dataflick.model.indicators.Config;
import org.dataflick.model.indicators.Indicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndicatorMapper implements Mapper<Indicator, IndicatorEntity> {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Indicator toModel(IndicatorEntity indicatorEntity) throws JsonProcessingException {
        Indicator indicator = new Indicator();
        indicator.setId(indicatorEntity.getId());
        indicator.setName(indicatorEntity.getName());
        indicator.setExecutionOrder(indicatorEntity.getExecutionOrder());
        indicator.setExitOnError(indicatorEntity.isExitOnError());
        indicator.setIsActive(indicatorEntity.isIsActive());
        indicator.setIsDefault(indicatorEntity.IsDefault());
        indicator.setTemplateKey(indicatorEntity.getTemplateKey());

        indicator.setConfig(objectMapper.readValue(indicatorEntity.getConfig(), Config.class));
        return indicator;
    }

    @Override
    public IndicatorEntity toEntity(Indicator indicator) throws JsonProcessingException {
        IndicatorEntity entity = new IndicatorEntity();
        entity.setName(indicator.getName());
        entity.setExecutionOrder(indicator.getExecutionOrder());
        entity.setExitOnError(indicator.isExitOnError());
        entity.setIsActive(indicator.isIsActive());
        entity.setIsDefault(indicator.IsDefault());
        entity.setTemplateKey(indicator.getTemplateKey());

        entity.setConfig(objectMapper.writeValueAsString(indicator.getConfig()));
        return entity;
    }
}
