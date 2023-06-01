package com.company.application.services;

import com.company.domain.model.Company;
import com.company.domain.ports.in.CompanyUseCase;

import java.util.List;
import java.util.Optional;

public class CompanyService implements CompanyUseCase {
  public final CompanyUseCase companyUseCase;

  public CompanyService(CompanyUseCase companyUseCase) {
    this.companyUseCase = companyUseCase;
  }

  @Override
  public Company createCompany(Company company) {
    return companyUseCase.createCompany(company);
  }

  @Override
  public Optional<Company> getCompanyById(Long id) {
    return companyUseCase.getCompanyById(id);
  }

  @Override
  public List<Company> getAllCompanies() {
    return companyUseCase.getAllCompanies();
  }

  @Override
  public Optional<Company> updateCompany(Long id, Company company) {
    return companyUseCase.updateCompany(id, company);
  }

  @Override
  public boolean deleteCompany(Long id) {
    return companyUseCase.deleteCompany(id);
  }
}
