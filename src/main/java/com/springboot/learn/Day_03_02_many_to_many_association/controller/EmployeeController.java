package com.springboot.learn.Day_03_02_many_to_many_association.controller;

import com.springboot.learn.Day_03_02_many_to_many_association.entity.Employee;
import com.springboot.learn.Day_03_02_many_to_many_association.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee created successfully!");
    }

    @GetMapping(value = {"/", "/{empId}"})
    public ResponseEntity<?> getEmployees(@PathVariable(required = false) Long empId) {
        if(empId!=null) {
            Optional<Employee> employee = employeeRepository.findById(empId);
            if (employee.isPresent()) {
//                return ResponseEntity.ok(employee.get());
                return ResponseEntity.status(HttpStatus.OK).body(employee.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found!");
            }
        } else {
            List<Employee> employees = employeeRepository.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(employees);
        }
    }
}
