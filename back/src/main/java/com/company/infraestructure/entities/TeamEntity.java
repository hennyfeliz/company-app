package com.company.infraestructure.entities;

import com.company.domain.model.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "team")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "team_name")
  private String teamName;

  @Column(name = "leader")
  private int employee;

  public static TeamEntity fromDomainModel(Team team){
    return new TeamEntity(team.getId(), team.getTeamName(), team.getEmployee());
  }

  public Team toDomainModel(){
    return new Team(id, teamName, employee);
  }
}
