package com.company.domain.model;

public class Team {
  private Long id;
  private String teamName;
  private int employee;

  public Team(Long id, String teamName, int employee) {
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

  public int getEmployee() {
    return employee;
  }

  public void setEmployee(int employee) {
    this.employee = employee;
  }
}
