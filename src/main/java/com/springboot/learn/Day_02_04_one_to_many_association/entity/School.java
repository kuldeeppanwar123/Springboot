package com.springboot.learn.Day_02_04_one_to_many_association.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "school")
    private List<Student>students = new ArrayList<>();

    public String toString() {
        return "School: { name: " + this.name + ", students : " + this.students.toString() + " } ";
    }
}
