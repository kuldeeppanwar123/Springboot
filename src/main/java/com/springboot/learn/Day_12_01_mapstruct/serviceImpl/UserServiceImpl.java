package com.springboot.learn.Day_12_01_mapstruct.serviceImpl;

import com.springboot.learn.Day_12_01_mapstruct.dto.UserRequestDto;
import com.springboot.learn.Day_12_01_mapstruct.dto.UserResponseDto;
import com.springboot.learn.Day_12_01_mapstruct.entity.User;
import com.springboot.learn.Day_12_01_mapstruct.repository.UserRepository;
import com.springboot.learn.Day_12_01_mapstruct.service.UserService;
import com.springboot.learn.Day_12_01_mapstruct.structMapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = userMapper.fromUserRequestDtoToUser(userRequestDto);
        User savedUser= userRepository.save(user);
        return userMapper.fromUserToUserResponseDto(savedUser);
    }

    @Override
    public UserResponseDto getUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()){
            return userMapper.fromUserToUserResponseDto(user.get());
        }
        return null;
    }
}
