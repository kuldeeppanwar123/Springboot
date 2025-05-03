package com.springboot.learn.Day_02_04_one_to_many_association.entity;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    private School school;

    public String toString() {
        return "Student: { name: " + this.name + " }";
    }
}
