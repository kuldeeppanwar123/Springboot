package com.springboot.learn.Day_12_01_mapstruct.controllerImpl;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import com.springboot.learn.Day_12_01_mapstruct.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserControllerImpl  {
    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<UserResponseDto>createUser(@RequestBody UserRequestDto userRequestDto) {
        return ResponseEntity.ok(userService.createUser(userRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto>getUser(Long id) {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
