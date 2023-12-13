package com.palladium.excercise.controller;

import com.palladium.excercise.dto.UserDto;
import com.palladium.excercise.mapper.UserMapper;
import com.palladium.excercise.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public ResponseEntity<Users> saveUser(@Valid @RequestBody UserDto user){

Users user = user service.save(user);
return new ResponseEntity(user, HttpStatus.CREATED);
}
}
