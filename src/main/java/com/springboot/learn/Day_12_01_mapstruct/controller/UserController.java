package com.springboot.learn.Day_12_01_mapstruct.controller;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public interface UserController {
    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto);
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUser(@RequestParam Long id);
}
