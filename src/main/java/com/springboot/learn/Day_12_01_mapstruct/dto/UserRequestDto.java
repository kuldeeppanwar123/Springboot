package com.springboot.learn.Day_12_01_mapstruct.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestDto {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String atmNumber;
    private String atmPin;
}
