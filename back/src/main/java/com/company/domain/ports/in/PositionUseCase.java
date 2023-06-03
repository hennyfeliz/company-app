package com.company.domain.ports.in;

import com.company.domain.model.Position;

import java.util.List;
import java.util.Optional;

public interface PositionUseCase {
  Position createPosition(Position position);
  Optional<Position> getPositionById(Long id);
  List<Position> getAllPosition();
  Optional<Position> updatePosition(Long id, Position position);
  boolean deletePosition(Long id);
}
