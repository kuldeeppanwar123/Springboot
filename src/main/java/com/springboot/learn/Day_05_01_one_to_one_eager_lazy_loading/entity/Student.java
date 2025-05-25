package com.springboot.learn.Day_05_01_one_to_one_eager_lazy_loading.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "student", fetch = FetchType.LAZY)
    private Laptop laptop;

    @Override
    public String toString() {
        return "student: { id: "+this.id+", name: "+this.name+" }";
    }
}
