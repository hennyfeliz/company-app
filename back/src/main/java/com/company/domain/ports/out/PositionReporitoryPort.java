package com.company.domain.ports.out;

import com.company.domain.model.Position;

import java.util.List;
import java.util.Optional;

public interface PositionReporitoryPort {
  Position save(Position position);
  Optional<Position> findById(Long id);
  List<Position> findAll();
  Optional<Position> update(Position position);
  boolean deleteById(Long id);
}
