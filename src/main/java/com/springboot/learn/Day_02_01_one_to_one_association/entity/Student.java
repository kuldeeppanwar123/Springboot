package com.springboot.learn.Day_02_01_one_to_one_association.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne()
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;

    @Override
    public String toString() {
        return "Student { id: " + this.id +", name: " + this.name + ", laptop : " + this.laptop + " }";
    }
}
