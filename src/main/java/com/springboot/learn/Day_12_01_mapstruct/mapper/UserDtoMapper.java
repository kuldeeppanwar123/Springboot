package com.springboot.learn.Day_12_01_mapstruct.mapper;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import com.springboot.learn.Day_12_01_mapstruct.entity.User;

public class UserDtoMapper {
    public static UserResponseDto userToUserResponseDto(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .phone(user.getPhoneNumber())
                .email(user.getEmail())
                .address(user.getAddress())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .atmNumber(user.getAtmNumber())
                .createdAt(user.getCreatedDate())
                .updatedAt(user.getUpdatedDate())
                .build();
    }
    public static User fromUserRequestDto(UserRequestDto userRequestDto) {
        return User.builder()
                .username(userRequestDto.getUsername())
                .address(userRequestDto.getAddress())
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .atmNumber(userRequestDto.getAtmNumber())
                .pin(userRequestDto.getAtmPin())
                .email(userRequestDto.getEmail())
                .phoneNumber(userRequestDto.getPhone())
                .password(userRequestDto.getPassword())
                .build();
    }
}
