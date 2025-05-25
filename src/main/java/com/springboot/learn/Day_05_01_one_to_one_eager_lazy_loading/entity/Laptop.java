package com.springboot.learn.Day_05_01_one_to_one_eager_lazy_loading.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) //default fetch type : EAGER
    private Student student;

    @Override
    public String toString() {
        return "laptop: { id: "+this.id+", name: "+this.name+", student: "+(this.student != null ? this.student : null)+" }";
    }
}
