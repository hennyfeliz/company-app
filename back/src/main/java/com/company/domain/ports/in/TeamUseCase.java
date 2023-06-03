package com.company.domain.ports.in;

import com.company.domain.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamUseCase {
  Team createTeam(Team team);
  Optional<Team> getTeamById(Long id);
  List<Team> getAllTeam();
  Optional<Team> updateTeam(Long id, Team team);
  boolean deleteTeam(Long id);
}
