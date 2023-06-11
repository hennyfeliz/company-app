package com.company.infraestructure.repositories;

import com.company.domain.model.User;
import com.company.infraestructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
  Optional<User> findByEmail(String email);

  //@Query("SELECT COUNT(u) > 0 FROM UserEntity u WHERE u.email = :email AND u.password = :password")
  @Query("SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password")
  Optional<UserEntity> existsByEmailAndPassword(String email, String password);
}
