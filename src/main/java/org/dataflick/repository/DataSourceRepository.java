package org.dataflick.repository;

import org.dataflick.entity.DataSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// dao
@Repository
public interface DataSourceRepository extends JpaRepository<DataSourceEntity, String> {

}
