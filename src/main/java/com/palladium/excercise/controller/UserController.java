package com.palladium.excercise.controller;

import com.palladium.excercise.domain.Users;
import com.palladium.excercise.dto.UserDto;
import com.palladium.excercise.mapper.UserMapper;
import com.palladium.excercise.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    @GetMapping
    public ResponseEntity<List<UserDto>> allUsers() {
        List<Users> users = userService.findAll();
        List<UserDto> userDto = users.stream().map(this.userMapper).collect(Collectors.toList());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }


@PostMapping
public ResponseEntity<Users> saveUser(@Validated @RequestBody UserDto user){

Users users = userService.save(user);
return new ResponseEntity(users, HttpStatus.CREATED);
}
}
