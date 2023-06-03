package com.company.infraestructure.repositories;

import com.company.infraestructure.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTeamRepository extends JpaRepository<TeamEntity, Long> {
}
