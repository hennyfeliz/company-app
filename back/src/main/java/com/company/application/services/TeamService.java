package com.company.application.services;

import com.company.domain.model.Team;
import com.company.domain.ports.in.TeamUseCase;

import java.util.List;
import java.util.Optional;

public class TeamService implements TeamUseCase {
  public final TeamUseCase teamUseCase;

  public TeamService(TeamUseCase teamUseCase) {
    this.teamUseCase = teamUseCase;
  }

  @Override
  public Team createTeam(Team team) {
    return teamUseCase.createTeam(team);
  }

  @Override
  public Optional<Team> getTeamById(Long id) {
    return teamUseCase.getTeamById(id);
  }

  @Override
  public List<Team> getAllTeam() {
    return teamUseCase.getAllTeam();
  }

  @Override
  public Optional<Team> updateTeam(Long id, Team team) {
    return teamUseCase.updateTeam(id, team);
  }

  @Override
  public boolean deleteTeam(Long id) {
    return teamUseCase.deleteTeam(id);
  }
}
