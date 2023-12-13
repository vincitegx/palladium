package com.palladium.excercise.service;

import com.palladium.excercise.domain.Users;
import com.palladium.excercise.dto.UserDto;
import com.palladium.excercise.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users save(UserDto user) {
        Users users = Users.builder().
                username(user.getUsername())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .dateCreated(user.getDateCreated())
                .status(user.getStatus())
                .build();
        return userRepository.save(users);
    }
}