package com.company.infraestructure.controllers;

import com.company.application.services.TeamService;
import com.company.domain.model.Team;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
  private final TeamService teamService;

  public TeamController(TeamService teamService) {
    this.teamService = teamService;
  }

  @GetMapping("/")
  public ResponseEntity<List<Team>> getAllTeams(){
    List<Team> teams = teamService.getAllTeam();
    return new ResponseEntity<>(teams, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Team> getTeamById(@PathVariable Long id){
    return teamService.getTeamById(id)
            .map(team -> new ResponseEntity<>(team, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/")
  public ResponseEntity<Team> createTeam(@RequestBody Team team){
    Team createdTeam = teamService.createTeam(team);
    return new ResponseEntity<>(createdTeam, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Team> updateTeam(@PathVariable Long id, @RequestBody Team team){
    return teamService.updateTeam(id, team)
            .map(team2 -> new ResponseEntity<>(team2, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteTeamById(@PathVariable Long id){
    if(teamService.deleteTeam(id)){
      return ResponseEntity.ok("Team deleted");
    } else{
      return new ResponseEntity<>("Team not found", HttpStatus.NOT_FOUND);
    }
  }
}
