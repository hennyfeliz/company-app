package com.company.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
  private Long id;
  private String employeeName;
  private String employeeLastname;
  private LocalDate contratationDate;
  private int position;
  private int team;

  public Employee(Long id, String employeeName, String employeeLastname, LocalDateTime contratationDate, int position, int team) {
    this.id = id;
    this.employeeName = employeeName;
    this.employeeLastname = employeeLastname;
    this.contratationDate = LocalDate.from(contratationDate);
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

  public LocalDate getContratationDate() {
    return contratationDate;
  }

  public void setContratationDate(LocalDate contratationDate) {
    this.contratationDate = contratationDate;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getTeam() {
    return team;
  }

  public void setTeam(int team) {
    this.team = team;
  }
}
