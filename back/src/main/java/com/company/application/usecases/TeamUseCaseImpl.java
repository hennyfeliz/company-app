package com.company.application.usecases;

import com.company.domain.model.Team;
import com.company.domain.ports.in.TeamUseCase;
import com.company.domain.ports.out.TeamRepositoryPort;

import java.util.List;
import java.util.Optional;

public class TeamUseCaseImpl implements TeamUseCase {
  public final TeamRepositoryPort teamRepositoryPort;

  public TeamUseCaseImpl(TeamRepositoryPort teamRepositoryPort) {
    this.teamRepositoryPort = teamRepositoryPort;
  }

  @Override
  public Team createTeam(Team team) {
    return teamRepositoryPort.save(team);
  }

  @Override
  public Optional<Team> getTeamById(Long id) {
    return teamRepositoryPort.findById(id);
  }

  @Override
  public List<Team> getAllTeam() {
    return teamRepositoryPort.findAll();
  }

  @Override
  public Optional<Team> updateTeam(Long id, Team team) {
    return teamRepositoryPort.update(team);
  }

  @Override
  public boolean deleteTeam(Long id) {
    return teamRepositoryPort.deleteById(id);
  }
}
