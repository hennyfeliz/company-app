package com.company.domain.model;

public class Position {

  private Long id;
  private String position;

  public Position(Long id, String position) {
    this.id = id;
    this.position = position;
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
}
