package com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employeeName", length = 44, nullable = false)
    private String name;

    public String toString() {
        return "Employee: { name: " + this.name + " }";
    }
}
