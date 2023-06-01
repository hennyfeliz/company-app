package com.company.domain.ports.out;

import com.company.domain.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyRepositoryPort {

  Company save(Company Company);
  Optional<Company> findById(Long id);
  List<Company> findAll();
  Optional<Company> update(Company Company);
  boolean deleteById(Long id);
}
