package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cat extends Animal {
    private Integer age;

    public String toString() {
        return "Cat: { id: "+this.id+", animalType: "+this.animalType+", age: "+this.age+" }";
    }
}
