package org.dataflick.repository;

import org.dataflick.entity.IndicatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// dao
@Repository
public interface IndicatorRepository extends JpaRepository<IndicatorEntity, String> {

    Optional<IndicatorEntity> findByName(String indicator);
}
