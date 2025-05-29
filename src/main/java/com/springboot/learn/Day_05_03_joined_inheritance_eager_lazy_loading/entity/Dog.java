package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dog extends Animal {
    private String breed;

    public String toString() {
        return "Dog: { id: "+this.id+", animalType: "+this.animalType+", breed: "+this.breed+" }";
    }
}
