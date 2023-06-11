package com.company.domain.model;

import com.company.infraestructure.entities.EmployeeEntity;

import java.util.List;

public class Team {
  private Long id;
  private String teamName;
  private List<EmployeeEntity> employee;

  public Team(Long id, String teamName, List<EmployeeEntity> employee) {
    this.id = id;
    this.teamName = teamName;
    this.employee = employee;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public List<EmployeeEntity> getEmployee() {
    return employee;
  }

  public void setEmployee(List<EmployeeEntity> employee) {
    this.employee = employee;
  }
}
