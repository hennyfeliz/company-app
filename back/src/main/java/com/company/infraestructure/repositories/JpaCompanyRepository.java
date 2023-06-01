package com.company.infraestructure.repositories;

import com.company.infraestructure.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
