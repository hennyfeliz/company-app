package com.company.infraestructure.repositories.Impl;

import com.company.domain.model.User;
import com.company.domain.ports.out.UserRepositoryPort;
import com.company.infraestructure.entities.UserEntity;
import com.company.infraestructure.repositories.JpaUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {
  private final JpaUserRepository jpaUserRepository;

  public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
    this.jpaUserRepository = jpaUserRepository;
  }

  @Override
  public User save(User user) {
    UserEntity userEntity = UserEntity.fromDomainModel(user);
    UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
    return savedUserEntity.toDomainModel();
  }

  @Override
  public Optional<User> findById(Long id) {
    return jpaUserRepository.findById(id).map(UserEntity::toDomainModel);
  }

  @Override
  public Optional<User> findByEmail(String email) {
    return jpaUserRepository.findByEmail(email);
  }

  @Override
  public List<User> findAll() {
    return jpaUserRepository.findAll()
            .stream()
            .map(UserEntity::toDomainModel)
            .collect(Collectors.toList());
  }

  @Override
  public Optional<User> update(User user) {
    if(jpaUserRepository.existsById(user.getId())){
      UserEntity userEntity = UserEntity.fromDomainModel(user);
      UserEntity updatedUser = jpaUserRepository.save(userEntity);
      return Optional.of(updatedUser.toDomainModel());
    }
    return Optional.empty();
  }

  @Override
  public boolean deleteById(Long id) {
    if(jpaUserRepository.existsById(id)){
      jpaUserRepository.deleteById(id);
      return true;
    }
    return false;
  }

  @Override
  public Optional<User> validateEmailAndPassword(String email, String password) {
    return jpaUserRepository.existsByEmailAndPassword(email, password).map(UserEntity::toDomainModel);
  }
}
