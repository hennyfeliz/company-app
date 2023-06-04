package com.company.infraestructure.entities;

import com.company.domain.model.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "company_")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "company_name", length = 50)
  private String companyName;

  //@Temporal(TemporalType.TIMESTAMP)
  @Column(name = "creation_date")
  private LocalDateTime creationDate;

  @Column(length = 50)
  private String employee;

  public static CompanyEntity fromDomainModel(Company company){
    return new CompanyEntity(company.getId(), company.getCompanyName(), company.getCreationDate(), company.getEmployee());
  }

  public Company toDomainModel(){
    return new Company(id, companyName, creationDate, employee);
  }
}
