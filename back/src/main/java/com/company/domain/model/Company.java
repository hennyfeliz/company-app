package com.company.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Company {
  private Long id;
  private String companyName;
  private LocalDateTime creationDate;
  private List<Employee> employee;

  public Company(Long id, String companyName, LocalDateTime creationDate, List<Employee> employee) {
    this.id = id;
    this.companyName = companyName;
    this.creationDate = creationDate;
    this.employee = employee;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public List<Employee> getEmployee() {
    return employee;
  }

  public void setEmployee(List<Employee> employee) {
    this.employee = employee;
  }
}
