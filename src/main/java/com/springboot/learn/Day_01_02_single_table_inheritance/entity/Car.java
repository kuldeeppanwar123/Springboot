package com.springboot.learn.Day_01_02_single_table_inheritance.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CAR")
@Setter
@ToString
public class Car extends Vehicle{
    private Integer numOfDoors;

    @Builder
    public Car(Long id, Long price, String color, Integer numOfDoors) {
        super(id, price, color);
        this.numOfDoors = numOfDoors;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", numOfDoors=" + numOfDoors +
                '}';
    }


}
