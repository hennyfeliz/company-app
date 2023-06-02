package com.company.domain.ports.in;

import com.company.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeUseCase {
  Employee createEmployee(Employee employee);
  Optional<Employee> getEmployeeById(Long id);
  List<Employee> getAllEmployees();
  Optional<Employee> updateEmployee(Long id, Employee employee);
  boolean deleteEmployee(Long id);
}
