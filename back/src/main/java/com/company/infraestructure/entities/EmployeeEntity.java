package com.company.infraestructure.entities;

import com.company.domain.model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "employee_name")
  private String employeeName;

  @Column(name = "employee_lastname")
  private String employeeLastname;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "company")
  private CompanyEntity company;

  @Column(name = "contratation_date")
  private LocalDateTime contratationDate;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "position")
  private PositionEntity position;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "team")
  private TeamEntity team;

  @JsonIgnore
  @OneToOne
  @JoinColumn(name = "userr")
  private UserEntity user;

  public static EmployeeEntity fromDomainModel(Employee employee){
    return new EmployeeEntity(employee.getId(), employee.getEmployeeName(), employee.getEmployeeLastname(), employee.getCompany(),employee.getContratationDate(), employee.getPosition(), employee.getTeam(), employee.getUser());
  }

  public Employee toDomainModel(){
    return new Employee(id, employeeName, employeeLastname, company,contratationDate, position, team, user);
  }
}
