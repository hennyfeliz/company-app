package com.company.infraestructure.config;

import com.company.application.services.CompanyService;
import com.company.application.usecases.CompanyUseCasesImpl;
import com.company.domain.ports.out.CompanyRepositoryPort;
import com.company.infraestructure.adapters.SomeExternalService;
import com.company.infraestructure.repositories.Impl.JpaCompanyRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  @Bean
  public CompanyService companyService(CompanyRepositoryPort companyRepositoryPort){
    return new CompanyService(new CompanyUseCasesImpl(companyRepositoryPort));
  }

  @Bean
  public CompanyRepositoryPort companyRepositoryPort(JpaCompanyRepositoryAdapter jpaCompanyRepositoryAdapter){
    return jpaCompanyRepositoryAdapter;
  }

  @Bean
  public SomeExternalService someExternalService(){
    return new SomeExternalService();
  }
}
