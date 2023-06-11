package com.company.infraestructure.controllers;

import com.company.application.services.UserService;
import com.company.domain.model.User;
import org.hibernate.event.spi.ResolveNaturalIdEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public ResponseEntity<List<User>> getAllUsers(){
    List<User> users = userService.getAllUser();
    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id){
    return userService.getUserById(id)
            .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping("/email/{email}")
  public ResponseEntity<User> getUserByEmail(@PathVariable String email){
    return userService.getUserByEmail(email)
            .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/")
  public ResponseEntity<User> createUser(@RequestBody User user){
    User createdUser = userService.createUser(user);
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
  }

  @GetMapping("/validate")
  public ResponseEntity<User> validateEmailAndPassword(@RequestBody User user){
    return userService.validateEmailAndPassword(user.getEmail(), user.getPassword())
            .map(userr -> new ResponseEntity<>(userr, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
    return userService.updateUser(id, user)
            .map(userr -> new ResponseEntity<>(userr, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteUser(@PathVariable Long id){
    if(userService.deleteUser(id)){
      return ResponseEntity.ok("User deleted");
    } else{
      return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }
  }
}
