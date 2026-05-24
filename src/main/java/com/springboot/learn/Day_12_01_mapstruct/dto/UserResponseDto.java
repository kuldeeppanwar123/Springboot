package com.springboot.learn.Day_12_01_mapstruct.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserResponseDto {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String atmNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
