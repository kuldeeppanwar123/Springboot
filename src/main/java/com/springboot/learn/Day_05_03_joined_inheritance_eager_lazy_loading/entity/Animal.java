package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String animalType;

    public String toString() {
        return "Animal: { id: "+this.id+", animalType: "+this.animalType+" }";
    }
}
