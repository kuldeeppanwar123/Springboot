package com.springboot.learn.Day_01_04_table_per_class_inheritance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "wildPets")
public class WildPet extends Pet {
    private String placeOfBirth;

    @Builder
    public WildPet(Long id, String name, String gender, String placeOfBirth) {
        super(id, name, gender);
        this.placeOfBirth = placeOfBirth;
    }
}
