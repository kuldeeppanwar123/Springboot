package com.springboot.learn.Day_01_02_single_table_inheritance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)

public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Long price;
    protected String color;

    @Override
    public String toString() {
        return "Vehicle{id=" + id + ", price=" + price + ", color='" + color + "'}";
    }
}
