package com.palladium.excercise.mapper;

import com.palladium.excercise.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserMapper implements Function<Users, UserDto> {
    @Override
    public UserDto apply(Users user) {
        return UserDto.builder()
                .username(user.getStageName())
                .email(user.getEmail())
                .phoneNumber(user.getRole())
                .dateCreated()
                .status()
                .build();
    }
}
