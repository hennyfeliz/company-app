package com.company.domain.model;

import com.company.infraestructure.entities.EmployeeEntity;

import java.util.List;

public class Position {

  private Long id;
  private String position;
  private List<EmployeeEntity> employees;

  public Position(Long id, String position, List<EmployeeEntity> employees) {
    this.id = id;
    this.position = position;
    this.employees = employees;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public List<EmployeeEntity> getEmployees() {
    return employees;
  }

  public void setEmployees(List<EmployeeEntity> employees) {
    this.employees = employees;
  }
}
