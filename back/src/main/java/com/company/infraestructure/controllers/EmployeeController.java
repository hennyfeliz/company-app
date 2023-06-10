package com.company.infraestructure.controllers;

import com.company.application.services.EmployeeService;
import com.company.domain.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/")
  public ResponseEntity<List<Employee>> getAllEmployees(){
    List<Employee> employees = employeeService.getAllEmployees();
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
    return employeeService.getEmployeeById(id)
            .map(employee -> new ResponseEntity<>(employee, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/")
  public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
    Employee createdEmployee = employeeService.createEmployee(employee);
    return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
    return employeeService.updateEmployee(id, employee)
            .map(employeen -> new ResponseEntity<>(employeen, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
    if(employeeService.deleteEmployee(id)){
      return ResponseEntity.ok("Employee deleted");
    } else{
      return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
    }
  }
}
