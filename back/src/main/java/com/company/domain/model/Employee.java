package com.company.domain.model;

import com.company.infraestructure.entities.CompanyEntity;
import com.company.infraestructure.entities.PositionEntity;
import com.company.infraestructure.entities.TeamEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
  private Long id;
  private String employeeName;
  private String employeeLastname;
  private CompanyEntity company;
  private LocalDateTime contratationDate;
  private PositionEntity position;
  private TeamEntity team;

  public Employee(Long id, String employeeName, String employeeLastname, CompanyEntity company, LocalDateTime contratationDate, PositionEntity position, TeamEntity team) {
    this.id = id;
    this.employeeName = employeeName;
    this.employeeLastname = employeeLastname;
    this.company = company;
    this.contratationDate = contratationDate;
    this.position = position;
    this.team = team;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeLastname() {
    return employeeLastname;
  }

  public void setEmployeeLastname(String employeeLastname) {
    this.employeeLastname = employeeLastname;
  }

  public CompanyEntity getCompany() {
    return company;
  }

  public void setCompany(CompanyEntity company) {
    this.company = company;
  }

  public LocalDateTime getContratationDate() {
    return contratationDate;
  }

  public void setContratationDate(LocalDateTime contratationDate) {
    this.contratationDate = contratationDate;
  }

  public PositionEntity getPosition() {
    return position;
  }

  public void setPosition(PositionEntity position) {
    this.position = position;
  }

  public TeamEntity getTeam() {
    return team;
  }

  public void setTeam(TeamEntity team) {
    this.team = team;
  }
}
