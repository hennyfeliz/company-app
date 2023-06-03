package com.company.infraestructure.repositories;

import com.company.infraestructure.entities.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPositionRepository extends JpaRepository<PositionEntity, Long> {
}
