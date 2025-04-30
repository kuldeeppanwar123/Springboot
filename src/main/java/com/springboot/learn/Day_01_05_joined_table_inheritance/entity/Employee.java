package com.springboot.learn.Day_01_05_joined_table_inheritance.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Employee extends Person{
    private String company;
    private Double salary;
}
