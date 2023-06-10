package com.company.domain.model;

public class User {
  private Long id;
  private String username;
  private String email;
  private String password;
  private int employee;

  public User(Long id, String username, String email, String password, int employee) {
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

  public int getEmployee() {
    return employee;
  }

  public void setEmployee(int employee) {
    this.employee = employee;
  }
}
