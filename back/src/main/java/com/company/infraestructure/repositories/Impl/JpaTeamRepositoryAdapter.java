package com.company.infraestructure.repositories.Impl;

import com.company.domain.model.Team;
import com.company.domain.ports.out.TeamRepositoryPort;
import com.company.infraestructure.entities.TeamEntity;
import com.company.infraestructure.repositories.JpaTeamRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaTeamRepositoryAdapter implements TeamRepositoryPort {
  private final JpaTeamRepository jpaTeamRepository;

  public JpaTeamRepositoryAdapter(JpaTeamRepository jpaTeamRepository) {
    this.jpaTeamRepository = jpaTeamRepository;
  }

  @Override
  public Team save(Team team) {
    TeamEntity teamEntity = TeamEntity.fromDomainModel(team);
    TeamEntity savedTeam = jpaTeamRepository.save(teamEntity);
    return savedTeam.toDomainModel();
  }

  @Override
  public Optional<Team> findById(Long id) {
    return jpaTeamRepository.findById(id)
            .map(TeamEntity::toDomainModel);
  }

  @Override
  public List<Team> findAll() {
    return jpaTeamRepository.findAll()
            .stream()
            .map(TeamEntity::toDomainModel)
            .collect(Collectors.toList());
  }

  @Override
  public Optional<Team> update(Team team) {
    if(jpaTeamRepository.existsById(team.getId())){
      TeamEntity teamEntity = TeamEntity.fromDomainModel(team);
      TeamEntity updatedEntity = jpaTeamRepository.save(teamEntity);
      return Optional.of(updatedEntity.toDomainModel());
    }
    return Optional.empty();
  }

  @Override
  public boolean deleteById(Long id) {
    if(jpaTeamRepository.existsById(id)){
      jpaTeamRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
