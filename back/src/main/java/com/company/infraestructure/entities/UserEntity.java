package com.company.infraestructure.entities;

import com.company.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column
  private String email;

  @Column
  private String password;

  @Column
  private String username;

  @Column
  private int employee;

  public static UserEntity fromDomainModel(User user){
    return new UserEntity(user.getId(), user.getEmail(), user.getPassword(), user.getUsername(), user.getEmployee());
  }

  public User toDomainModel(){
    return new User(id, email, password, username, employee);
  }
}
