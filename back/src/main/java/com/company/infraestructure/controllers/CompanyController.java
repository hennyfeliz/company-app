package com.company.infraestructure.controllers;

import com.company.application.services.CompanyService;
import com.company.domain.model.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
  private final CompanyService companyService;

  public CompanyController(CompanyService companyService) {
    this.companyService = companyService;
  }

  @PostMapping("/")
  public ResponseEntity<Company> createCompany(@RequestBody Company company){
    Company createdCompany = companyService.createCompany(company);
    return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
  }

  @GetMapping("/")
  public ResponseEntity<List<Company>> getAllCompanies(){
    List<Company> companies = companyService.getAllCompanies();
    return new ResponseEntity<>(companies, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Company> getCompanyById(@PathVariable Long id){
    return companyService.getCompanyById(id)
            .map(company -> new ResponseEntity<>(company, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PutMapping
  public ResponseEntity<Company> updateCompany(@PathVariable Long id, @RequestBody Company company){
    return companyService.updateCompany(id, company)
            .map(compay -> new ResponseEntity<>(compay, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteCompanyById(@PathVariable Long id){
    if(companyService.deleteCompany(id)){
      return ResponseEntity.ok("Company deleted.");
    } else{
      return new ResponseEntity<>("", HttpStatus.);
    }
  }
}
