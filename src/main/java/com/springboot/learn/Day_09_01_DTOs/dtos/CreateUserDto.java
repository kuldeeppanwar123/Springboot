package com.springboot.learn.Day_09_01_DTOs.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateUserDto {
    @NotNull(groups = BasicInfo.class, message = "First Name is required")
    @JsonProperty(value = "first_name")
    private String firstName;

    @NotNull(groups = BasicInfo.class, message = "Last Name is required")
    @JsonProperty(value = "last_name")
    private String lastName;

    @NotBlank(groups = AdvanceInfo.class, message = "Email can't be blank")
    @JsonProperty(value = "email")
    private String email;

    @NotBlank(groups = AdvanceInfo.class, message = "Phone can't be blank")
    @JsonProperty(value = "phone")
    private String phone;
}
