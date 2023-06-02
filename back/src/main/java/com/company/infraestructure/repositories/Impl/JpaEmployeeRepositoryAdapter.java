package com.company.infraestructure.repositories.Impl;

import com.company.domain.model.Employee;
import com.company.domain.ports.out.EmployeeRepositoryPort;
import com.company.infraestructure.entities.EmployeeEntity;
import com.company.infraestructure.repositories.JpaEmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaEmployeeRepositoryAdapter implements EmployeeRepositoryPort {

  public final JpaEmployeeRepository jpaEmployeeRepository;

  public JpaEmployeeRepositoryAdapter(JpaEmployeeRepository jpaEmployeeRepository) {
    this.jpaEmployeeRepository = jpaEmployeeRepository;
  }

  @Override
  public Employee save(Employee employee) {
    EmployeeEntity employeeEntity = EmployeeEntity.fromDomainModel(employee);
    EmployeeEntity savedEmployee = jpaEmployeeRepository.save(employeeEntity);
    return savedEmployee.toDomainModel();
  }

  @Override
  public Optional<Employee> findById(Long id) {
    return jpaEmployeeRepository.findById(id)
            .map(EmployeeEntity::toDomainModel);
  }

  @Override
  public List<Employee> findAll() {
    return jpaEmployeeRepository.findAll()
            .stream()
            .map(EmployeeEntity::toDomainModel)
            .collect(Collectors.toList());
  }

  @Override
  public Optional<Employee> update(Employee employee) {
    if(jpaEmployeeRepository.existsById(employee.getId())){
      EmployeeEntity employeeEntity = EmployeeEntity.fromDomainModel(employee);
      EmployeeEntity updatedEmployee = jpaEmployeeRepository.save(employeeEntity);
      return Optional.of(updatedEmployee.toDomainModel());
    }
    return Optional.empty();
  }

  @Override
  public boolean deleteById(Long id) {
    if(jpaEmployeeRepository.existsById(id)){
      jpaEmployeeRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
