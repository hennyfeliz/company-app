package com.company.application.services;

import com.company.domain.model.Employee;
import com.company.domain.ports.in.EmployeeUseCase;

import java.util.List;
import java.util.Optional;

public class EmployeeService implements EmployeeUseCase {
  public final EmployeeUseCase employeeUseCase;

  public EmployeeService(EmployeeUseCase employeeUseCase) {
    this.employeeUseCase = employeeUseCase;
  }

  @Override
  public Employee createEmployee(Employee employee) {
    return employeeUseCase.createEmployee(employee);
  }

  @Override
  public Optional<Employee> getEmployeeById(Long id) {
    return employeeUseCase.getEmployeeById(id);
  }

  @Override
  public List<Employee> getAllEmployees() {
    return employeeUseCase.getAllEmployees();
  }

  @Override
  public Optional<Employee> updateEmployee(Long id, Employee employee) {
    return employeeUseCase.updateEmployee(id, employee);
  }

  @Override
  public boolean deleteEmployee(Long id) {
    return employeeUseCase.deleteEmployee(id);
  }
}
