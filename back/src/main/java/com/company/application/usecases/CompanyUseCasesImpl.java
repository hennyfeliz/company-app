package com.company.application.usecases;

import com.company.domain.model.Company;
import com.company.domain.ports.in.CompanyUseCase;
import com.company.domain.ports.out.CompanyRepositoryPort;

import java.util.List;
import java.util.Optional;

public class CompanyUseCasesImpl implements CompanyUseCase {
  public final CompanyRepositoryPort companyRepositoryPort;

  public CompanyUseCasesImpl(CompanyRepositoryPort companyRepositoryPort) {
    this.companyRepositoryPort = companyRepositoryPort;
  }

  @Override
  public Company createCompany(Company company) {
    return companyRepositoryPort.save(company);
  }

  @Override
  public Optional<Company> getCompanyById(Long id) {
    return companyRepositoryPort.findById(id);
  }

  @Override
  public List<Company> getAllCompanies() {
    return companyRepositoryPort.findAll();
  }

  @Override
  public Optional<Company> updateCompany(Long id, Company company) {
    return companyRepositoryPort.update(company);
  }

  @Override
  public boolean deleteCompany(Long id) {
    return companyRepositoryPort.deleteById(id);
  }
}
