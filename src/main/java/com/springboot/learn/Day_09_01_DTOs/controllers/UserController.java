package com.springboot.learn.Day_09_01_DTOs.controllers;

import com.springboot.learn.Day_09_01_DTOs.dtos.AdvanceInfo;
import com.springboot.learn.Day_09_01_DTOs.dtos.BasicInfo;
import com.springboot.learn.Day_09_01_DTOs.dtos.CreateCustomerDto;
import com.springboot.learn.Day_09_01_DTOs.dtos.CreateUserDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("/")
    public ResponseEntity<?> basicCreate(@RequestBody @Validated(BasicInfo.class) CreateUserDto request) {
        Map<String, String> res = new HashMap<>();
        res.put("status", "success");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("/v2")
    public ResponseEntity<?> basicCreateV2(@RequestBody @Validated(AdvanceInfo.class) CreateUserDto request) {
        Map<String, String> res = new HashMap<>();
        res.put("status", "success");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
