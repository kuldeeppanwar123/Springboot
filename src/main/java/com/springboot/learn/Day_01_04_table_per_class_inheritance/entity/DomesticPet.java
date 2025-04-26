package com.springboot.learn.Day_01_04_table_per_class_inheritance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "domesticPets")
@AllArgsConstructor
@NoArgsConstructor

public class DomesticPet extends Pet {
    protected Date dateOfBirth;
    protected Long price;

    @Builder
    public DomesticPet(Long id, String name, String gender, Date dateOfBirth, Long price) {
        super(id, name, gender);
        this.dateOfBirth = dateOfBirth;
        this.price = price;
    }
}
