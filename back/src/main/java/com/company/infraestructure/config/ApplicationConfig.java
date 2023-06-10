package com.company.infraestructure.config;

import com.company.application.services.*;
import com.company.application.usecases.*;
import com.company.domain.model.Team;
import com.company.domain.ports.out.*;
import com.company.infraestructure.adapters.SomeExternalService;
import com.company.infraestructure.repositories.Impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  // Company
  @Bean
  public CompanyService companyService(CompanyRepositoryPort companyRepositoryPort){
    return new CompanyService(new CompanyUseCasesImpl(companyRepositoryPort));
  }

  @Bean
  public CompanyRepositoryPort companyRepositoryPort(JpaCompanyRepositoryAdapter jpaCompanyRepositoryAdapter){
    return jpaCompanyRepositoryAdapter;
  }

  // Employee

  @Bean
  public EmployeeService employeeService(EmployeeRepositoryPort employeeRepositoryPort){
    return new EmployeeService(new EmployeUseCaseImpl(employeeRepositoryPort));
  }

  @Bean
  public EmployeeRepositoryPort employeeRepositoryPort(JpaEmployeeRepositoryAdapter jpaEmployeeRepositoryAdapter){
    return jpaEmployeeRepositoryAdapter;
  }

  // Position

  @Bean
  public PositionService positionService(PositionReporitoryPort positionReporitoryPort){
    return new PositionService(new PositionUseCaseImpl(positionReporitoryPort));
  }

  @Bean
  public PositionReporitoryPort positionReporitoryPort(JpaPositionRepositoryAdapter jpaPositionRepositoryAdapter){
    return jpaPositionRepositoryAdapter;
  }

  // Team
  @Bean
  public TeamService teamService(TeamRepositoryPort teamRepositoryPort){
    return new TeamService(new TeamUseCaseImpl(teamRepositoryPort));
  }

  @Bean
  public TeamRepositoryPort teamRepositoryPort(JpaTeamRepositoryAdapter jpaTeamRepositoryAdapter){
    return jpaTeamRepositoryAdapter;
  }

  // User

  @Bean
  public UserService userService(UserRepositoryPort userRepositoryPort){
    return new UserService(new UserUseCaseImpl(userRepositoryPort));
  }

  @Bean
  public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter){
    return jpaUserRepositoryAdapter;
  }

  // SomeExternalServices

  @Bean
  public SomeExternalService someExternalService(){
    return new SomeExternalService();
  }
}
