package com.palladium.excercise.mapper;

import com.palladium.excercise.domain.Users;
import com.palladium.excercise.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserMapper implements Function<Users, UserDto> {
    @Override
    public UserDto apply(Users user) {
        return UserDto.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .phoneNumber(user.getUsername())
                .dateCreated(user.getDateCreated())
                .status(user.getStatus())
                .build();
    }
}
