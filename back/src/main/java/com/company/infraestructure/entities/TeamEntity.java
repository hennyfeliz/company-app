package com.company.infraestructure.entities;

import com.company.domain.model.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

  @JsonIgnore
  @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
  private List<EmployeeEntity> employee;

  public static TeamEntity fromDomainModel(Team team){
    return new TeamEntity(team.getId(), team.getTeamName(), team.getEmployee());
  }

  public Team toDomainModel(){
    return new Team(id, teamName, employee);
  }
}
