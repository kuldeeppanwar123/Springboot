package com.springboot.learn.Day_02_00_embedded_and_embeddable.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ContactPerson {
    private String firstName;
    private String lastName;
    private String phone;
}
