package org.dataflick.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Mapper <MODEL, ENTITY> {
    MODEL toModel(ENTITY entity) throws JsonProcessingException;
    ENTITY toEntity(MODEL model) throws JsonProcessingException;
}
