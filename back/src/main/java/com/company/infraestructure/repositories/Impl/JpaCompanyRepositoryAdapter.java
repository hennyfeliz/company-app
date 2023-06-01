package com.company.infraestructure.repositories.Impl;

import com.company.domain.model.Company;
import com.company.domain.ports.out.CompanyRepositoryPort;
import com.company.infraestructure.entities.CompanyEntity;
import com.company.infraestructure.repositories.JpaCompanyRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCompanyRepositoryAdapter implements CompanyRepositoryPort {
  private final JpaCompanyRepository jpaCompanyRepository;

  public JpaCompanyRepositoryAdapter(JpaCompanyRepository jpaCompanyRepository) {
    this.jpaCompanyRepository = jpaCompanyRepository;
  }

  @Override
  public Company save(Company company) {
    CompanyEntity companyEntity = CompanyEntity.fromDomainModel(company);
    CompanyEntity savedCompanyEntity = jpaCompanyRepository.save(companyEntity);
    return savedCompanyEntity.toDomainModel();
  }

  @Override
  public Optional<Company> findById(Long id) {
    return jpaCompanyRepository.findById(id).map(CompanyEntity::toDomainModel);
  }

  @Override
  public List<Company> findAll() {
    return jpaCompanyRepository.findAll().stream().map(CompanyEntity::toDomainModel).collect(Collectors.toList());
  }

  @Override
  public Optional<Company> update(Company company) {
    if(jpaCompanyRepository.existsById(company.getId())){
      CompanyEntity companyEntity = CompanyEntity.fromDomainModel(company);
      CompanyEntity updatedCompany = jpaCompanyRepository.save(companyEntity);
      return Optional.of(updatedCompany.toDomainModel());
    }
    return Optional.empty();
  }

  @Override
  public boolean deleteById(Long id) {
    if(jpaCompanyRepository.existsById(id)){
      jpaCompanyRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
