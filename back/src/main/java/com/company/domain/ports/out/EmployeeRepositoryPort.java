package com.company.domain.ports.out;

import com.company.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepositoryPort {
  Employee save(Employee employee);
  Optional<Employee> findById(Long id);
  List<Employee> findAll();
  Optional<Employee> update(Employee employee);
  boolean deleteById(Long id);
}
