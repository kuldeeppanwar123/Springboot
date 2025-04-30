package com.springboot.learn.Day_01_05_joined_table_inheritance.entity;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student extends Person{
    private String school;
    private Double fees;
}
