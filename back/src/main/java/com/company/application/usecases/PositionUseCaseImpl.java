package com.company.application.usecases;

import com.company.domain.model.Position;
import com.company.domain.ports.in.PositionUseCase;
import com.company.domain.ports.out.PositionReporitoryPort;

import java.util.List;
import java.util.Optional;

public class PositionUseCaseImpl implements PositionUseCase {
  public final PositionReporitoryPort positionReporitoryPort;

  public PositionUseCaseImpl(PositionReporitoryPort positionReporitoryPort) {
    this.positionReporitoryPort = positionReporitoryPort;
  }

  @Override
  public Position createPosition(Position position) {
    return positionReporitoryPort.save(position);
  }

  @Override
  public Optional<Position> getPositionById(Long id) {
    return positionReporitoryPort.findById(id);
  }

  @Override
  public List<Position> getAllPosition() {
    return positionReporitoryPort.findAll();
  }

  @Override
  public Optional<Position> updatePosition(Long id, Position position) {
    return positionReporitoryPort.update(position);
  }

  @Override
  public boolean deletePosition(Long id) {
    return positionReporitoryPort.deleteById(id);
  }
}
