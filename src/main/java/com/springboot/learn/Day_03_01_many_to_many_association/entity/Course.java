package com.springboot.learn.Day_03_01_many_to_many_association.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    public String toString() {
        return "Course: { name: "+this.name+", price: "+this.price+", students: "+this.students+" }";
    }
}
