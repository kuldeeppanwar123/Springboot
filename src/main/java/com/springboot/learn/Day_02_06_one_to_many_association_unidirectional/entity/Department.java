package com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptId")
    private Long id;

    @Column(name = "deptName", length = 25, nullable = false, unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "deptId")
    private List<Employee> employees = new ArrayList<>();

    public String toString () {
        return "Department: { name: " + this.name + ", employees: " + this.employees + " }";
    }
}
