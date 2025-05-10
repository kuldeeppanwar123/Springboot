package com.springboot.learn.Day_03_02_many_to_many_association.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salary;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_project",
            joinColumns = {
                    @JoinColumn(name = "employee_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "project_id", referencedColumnName = "id")
            }
    )
    private Set<Project> projects = new HashSet<>();
}
