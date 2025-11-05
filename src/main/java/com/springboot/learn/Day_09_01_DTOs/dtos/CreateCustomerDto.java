package com.springboot.learn.Day_09_01_DTOs.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class CreateCustomerDto {
    @NotNull(message = "first name is required")
    @JsonProperty(value = "first_name")
    private String firstName;
    @NotNull(message = "last name is required")
    @JsonProperty(value = "last_name")
    private String lastName;
    @Email(message = "invalid email")
    private String email;
}
