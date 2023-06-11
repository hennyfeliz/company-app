package com.company.infraestructure.entities;

import com.company.domain.model.Company;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

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

  @JsonIgnore
  @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
  private List<EmployeeEntity> employee;

  public static CompanyEntity fromDomainModel(Company company){
    return new CompanyEntity(company.getId(), company.getCompanyName(), company.getCreationDate(), company.getEmployee());
  }

  public Company toDomainModel(){
    return new Company(id, companyName, creationDate, employee);
  }
}
