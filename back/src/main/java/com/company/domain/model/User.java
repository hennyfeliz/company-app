package com.company.domain.model;

import com.company.infraestructure.entities.EmployeeEntity;

public class User {
  private Long id;
  private String username;
  private String email;
  private String password;
  private EmployeeEntity employee;

  public User(Long id, String email, String password, String username, EmployeeEntity employee) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.employee = employee;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EmployeeEntity getEmployee() {
    return employee;
  }

  public void setEmployee(EmployeeEntity employee) {
    this.employee = employee;
  }
}
