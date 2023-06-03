package com.company.infraestructure.controllers;

import com.company.application.services.PositionService;
import com.company.domain.model.Position;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {
  private final PositionService positionService;

  public PositionController(PositionService positionService) {
    this.positionService = positionService;
  }

  @GetMapping("/")
  public ResponseEntity<List<Position>> getAllPositions(){
    List<Position> position = positionService.getAllPosition();
    return new ResponseEntity<>(position, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Position> getPositionById(@PathVariable Long id){
    return positionService.getPositionById(id)
            .map(position -> new ResponseEntity<>(position, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/")
  public ResponseEntity<Position> createPosition(@RequestBody Position position){
    Position createdPosition = positionService.createPosition(position);
    return new ResponseEntity<>(createdPosition, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Position> updatePosition(@PathVariable Long id, @RequestBody Position position){
    return positionService.updatePosition(id, position)
            .map(positionn -> new ResponseEntity<>(positionn, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deletePosition(@PathVariable Long id){
    if(positionService.deletePosition(id)){
      return ResponseEntity.ok("Position deleted");
    } else{
      return new ResponseEntity<>("Position not found", HttpStatus.NOT_FOUND);
    }
  }
}

