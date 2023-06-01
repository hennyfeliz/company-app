package com.company.domain.ports.in;

import com.company.domain.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyUseCase {
  Company createCompany(Company company);
  Optional<Company> getCompanyById(Long id);
  List<Company> getAllCompanies();
  Optional<Company> updateCompany(Long id, Company company);
  boolean deleteCompany(Long id);
}
