package com.palladium.excercise.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {
    private String username;
    private String email;
    private String phoneNumber;
    private String status;
    private LocalDateTime dateCreated;
}
