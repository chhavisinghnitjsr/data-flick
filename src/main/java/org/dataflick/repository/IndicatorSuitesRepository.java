package org.dataflick.repository;

import org.dataflick.entity.IndicatorEntity;
import org.dataflick.entity.IndicatorSuitesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// dao
@Repository
public interface IndicatorSuitesRepository extends JpaRepository<IndicatorSuitesEntity, String> {

}
