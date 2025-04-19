package com.springboot.learn.Day_01_03_single_table_inheritance.entity;

import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Vehicle;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("PERM")
@AllArgsConstructor
@NoArgsConstructor
public class PermanentEmployee extends Employee {
    private Integer employeeId;

    @Builder
    public PermanentEmployee(Long id, String name, Integer employeeId) {
        super(id, name);
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "PERM{" +
                "id=" + id +
                ", name=" + name +
                ", employeeId='" + employeeId +
                '}';
    }
}

