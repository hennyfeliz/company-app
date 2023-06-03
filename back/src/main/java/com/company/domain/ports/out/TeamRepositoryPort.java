package com.company.domain.ports.out;

import com.company.domain.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepositoryPort {
  Team save(Team team);
  Optional<Team> findById(Long id);
  List<Team> findAll();
  Optional<Team> update(Team team);
  boolean deleteById(Long id);
}
