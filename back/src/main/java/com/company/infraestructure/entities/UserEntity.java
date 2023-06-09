package com.company.infraestructure.entities;

import com.company.domain.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userr")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "username")
  private String username;

  @JsonIgnore
  @OneToOne
  @JoinColumn(name = "employee")
  private EmployeeEntity employee;

  public static UserEntity fromDomainModel(User user){
    return new UserEntity(user.getId(), user.getEmail(), user.getPassword(), user.getUsername(), user.getEmployee());
  }

  public User toDomainModel(){
    return new User(id, email, password, username, employee);
  }
}
