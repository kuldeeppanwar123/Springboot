package com.springboot.learn.Day_12_01_mapstruct.service;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponseDto getUser(Long userId);
    UserResponseDto createUser(UserRequestDto userRequestDto);
}
