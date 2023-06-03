package com.company.infraestructure.config;

import com.company.application.services.CompanyService;
import com.company.application.services.EmployeeService;
import com.company.application.services.PositionService;
import com.company.application.services.TeamService;
import com.company.application.usecases.CompanyUseCasesImpl;
import com.company.application.usecases.EmployeUseCaseImpl;
import com.company.application.usecases.PositionUseCaseImpl;
import com.company.application.usecases.TeamUseCaseImpl;
import com.company.domain.model.Team;
import com.company.domain.ports.out.CompanyRepositoryPort;
import com.company.domain.ports.out.EmployeeRepositoryPort;
import com.company.domain.ports.out.PositionReporitoryPort;
import com.company.domain.ports.out.TeamRepositoryPort;
import com.company.infraestructure.adapters.SomeExternalService;
import com.company.infraestructure.repositories.Impl.JpaCompanyRepositoryAdapter;
import com.company.infraestructure.repositories.Impl.JpaEmployeeRepositoryAdapter;
import com.company.infraestructure.repositories.Impl.JpaPositionRepositoryAdapter;
import com.company.infraestructure.repositories.Impl.JpaTeamRepositoryAdapter;
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


  // SomeExternalServices

  @Bean
  public SomeExternalService someExternalService(){
    return new SomeExternalService();
  }
}
