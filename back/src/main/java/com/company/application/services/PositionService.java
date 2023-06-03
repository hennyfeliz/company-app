package com.company.application.services;

import com.company.domain.model.Position;
import com.company.domain.ports.in.PositionUseCase;

import java.util.List;
import java.util.Optional;

public class PositionService implements PositionUseCase {
  public final PositionUseCase positionUseCase;

  public PositionService(PositionUseCase positionUseCase) {
    this.positionUseCase = positionUseCase;
  }

  @Override
  public Position createPosition(Position position) {
    return positionUseCase.createPosition(position);
  }

  @Override
  public Optional<Position> getPositionById(Long id) {
    return positionUseCase.getPositionById(id);
  }

  @Override
  public List<Position> getAllPosition() {
    return positionUseCase.getAllPosition();
  }

  @Override
  public Optional<Position> updatePosition(Long id, Position position) {
    return positionUseCase.updatePosition(id, position);
  }

  @Override
  public boolean deletePosition(Long id) {
    return positionUseCase.deletePosition(id);
  }
}
