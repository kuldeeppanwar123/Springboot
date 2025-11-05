package com.springboot.learn.Day_09_01_DTOs.controllers;

import com.springboot.learn.Day_09_01_DTOs.dtos.CreateCustomerDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @PostMapping("/")
    public ResponseEntity<?> createCustomer(@RequestBody @Valid CreateCustomerDto request) {
    return ResponseEntity.ok("success");
    }
}
