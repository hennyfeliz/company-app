package com.company.infraestructure.entities;

import com.company.domain.model.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

  public static PositionEntity fromDomainModel(Position position){
    return new PositionEntity(position.getId(), position.getPosition());
  }

  public Position toDomainModel(){
    return new Position(id, positionName);
  }
}
