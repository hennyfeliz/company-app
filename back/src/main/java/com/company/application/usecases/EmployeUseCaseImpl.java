package com.company.application.usecases;

import com.company.domain.model.Employee;
import com.company.domain.ports.in.EmployeeUseCase;
import com.company.domain.ports.out.EmployeeRepositoryPort;

import java.util.List;
import java.util.Optional;

public class EmployeUseCaseImpl implements EmployeeUseCase {
  public final EmployeeRepositoryPort employeeRepositoryPort;

  public EmployeUseCaseImpl(EmployeeRepositoryPort employeeRepositoryPort) {
    this.employeeRepositoryPort = employeeRepositoryPort;
  }

  @Override
  public Employee createEmployee(Employee employee) {
    return employeeRepositoryPort.save(employee);
  }

  @Override
  public Optional<Employee> getEmployeeById(Long id) {
    return employeeRepositoryPort.findById(id);
  }

  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepositoryPort.findAll();
  }

  @Override
  public Optional<Employee> updateEmployee(Long id, Employee employee) {
    return employeeRepositoryPort.update(employee);
  }

  @Override
  public boolean deleteEmployee(Long id) {
    return employeeRepositoryPort.deleteById(id);
  }
}
