package com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY) //default is eager
    private Student student;

    @Override
    public String toString() {
        return "course: { id: "+this.id+", name: "+this.name+" }";
    }
}
