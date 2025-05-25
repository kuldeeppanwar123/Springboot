package com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true) //default fetch type is LAZY
    private List<Course> courses = new ArrayList<>();

    @Override
    public String toString() {
        return "student: { id: "+this.id+", name: "+this.name+", courses: "+this.courses+" }";
    }
}
