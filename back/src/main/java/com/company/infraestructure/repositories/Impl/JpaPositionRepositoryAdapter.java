package com.company.infraestructure.repositories.Impl;

import com.company.domain.model.Position;
import com.company.domain.ports.out.PositionReporitoryPort;
import com.company.infraestructure.entities.PositionEntity;
import com.company.infraestructure.repositories.JpaPositionRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaPositionRepositoryAdapter implements PositionReporitoryPort {

  public final JpaPositionRepository jpaPositionRepository;

  public JpaPositionRepositoryAdapter(JpaPositionRepository jpaPositionRepository) {
    this.jpaPositionRepository = jpaPositionRepository;
  }

  @Override
  public Position save(Position position) {
    PositionEntity positionEntity = PositionEntity.fromDomainModel(position);
    PositionEntity savedPosition = jpaPositionRepository.save(positionEntity);
    return savedPosition.toDomainModel();
  }

  @Override
  public Optional<Position> findById(Long id) {
    return jpaPositionRepository.findById(id)
            .map(PositionEntity::toDomainModel);
  }

  @Override
  public List<Position> findAll() {
    return jpaPositionRepository.findAll()
            .stream()
            .map(PositionEntity::toDomainModel)
            .collect(Collectors.toList());
  }

  @Override
  public Optional<Position> update(Position position) {
    if(jpaPositionRepository.existsById(position.getId())){
      PositionEntity positionEntity = PositionEntity.fromDomainModel(position);
      PositionEntity updatedPosition = jpaPositionRepository.save(positionEntity);
      return Optional.of(updatedPosition.toDomainModel());
    }
    return Optional.empty();
  }

  @Override
  public boolean deleteById(Long id) {
    if(jpaPositionRepository.existsById(id)){
      jpaPositionRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
