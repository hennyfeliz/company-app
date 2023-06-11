package com.company.infraestructure.entities;

import com.company.domain.model.Position;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "position")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PositionEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "position_name")
  private String positionName;

  @JsonIgnore
  @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
  private List<EmployeeEntity> employees;

  public static PositionEntity fromDomainModel(Position position){
    return new PositionEntity(position.getId(), position.getPosition(), position.getEmployees());
  }

  public Position toDomainModel(){
    return new Position(id, positionName, employees);
  }
}
