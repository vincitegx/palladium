package com.palladium.excercise.service;

import com.palladium.excercise.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Users> findAll(){
        return userRepository.findAll();
    }
}
