package com.company.infraestructure.entities;

import com.company.domain.model.Employee;
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
  @Column(name = "employee_id")
  private Long id;

  @Column(name = "employee_name")
  private String employeeName;

  @Column(name = "employee_lastname")
  private String employeeLastname;

  @Column(name = "contratation_date")
  private LocalDateTime contratationDate;

  private int position;
  private int team;

  public static EmployeeEntity fromDomainModel(Employee employee){
    return new EmployeeEntity(employee.getId(), employee.getEmployeeName(), employee.getEmployeeLastname(), employee.getContratationDate().atStartOfDay(), employee.getPosition(), employee.getTeam());
  }

  public Employee toDomainModel(){
    return new Employee(id, employeeName, employeeLastname, contratationDate, position, team);
  }
}
