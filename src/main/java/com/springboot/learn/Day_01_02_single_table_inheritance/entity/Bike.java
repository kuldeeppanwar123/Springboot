package com.springboot.learn.Day_01_02_single_table_inheritance.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("BIKE")
@AllArgsConstructor
@NoArgsConstructor
public class Bike extends Vehicle{
    private Integer petrolCapacity;
    @Builder
    public Bike(Long id, Long price, String color, Integer petrolCapacity) {
        super(id, price, color);
        this.petrolCapacity = petrolCapacity;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", petrolCapacity=" + petrolCapacity +
                '}';
    }
}
