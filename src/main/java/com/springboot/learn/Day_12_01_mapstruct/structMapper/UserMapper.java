package com.springboot.learn.Day_12_01_mapstruct.structMapper;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import com.springboot.learn.Day_12_01_mapstruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "phone", target = "phoneNumber")
    public User fromUserRequestDtoToUser(UserRequestDto userRequestDto);

    @Mapping(source = "phoneNumber", target = "phone")
    @Mapping(source = "createdDate", target = "createdAt")
    @Mapping(source = "updatedDate", target = "updatedAt")
    @Mapping(target = "atmNumber", ignore = true)
    public UserResponseDto fromUserToUserResponseDto(User user);

    public List<UserResponseDto> fromUserToUserResponseDtoList(List<User> users);
}
