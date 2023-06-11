package com.company.application.services;

import com.company.domain.model.User;
import com.company.domain.ports.in.UserUseCase;

import java.util.List;
import java.util.Optional;

public class UserService implements UserUseCase {
  public final UserUseCase userUseCase;

  public UserService(UserUseCase userUseCase) {
    this.userUseCase = userUseCase;
  }

  @Override
  public User createUser(User user) {
    return userUseCase.createUser(user);
  }

  @Override
  public Optional<User> getUserById(Long id) {
    return userUseCase.getUserById(id);
  }

  @Override
  public Optional<User> getUserByEmail(String email) {
    return userUseCase.getUserByEmail(email);
  }

  @Override
  public List<User> getAllUser() {
    return userUseCase.getAllUser();
  }

  @Override
  public Optional<User> updateUser(Long id, User user) {
    return userUseCase.updateUser(id, user);
  }

  @Override
  public boolean deleteUser(Long id) {
    return userUseCase.deleteUser(id);
  }

  @Override
  public Optional<User>  validateEmailAndPassword(String email, String password) {
    return userUseCase.validateEmailAndPassword(email, password);
  }
}
