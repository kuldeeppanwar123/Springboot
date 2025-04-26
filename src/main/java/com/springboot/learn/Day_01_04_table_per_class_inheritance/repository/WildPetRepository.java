package com.springboot.learn.Day_01_04_table_per_class_inheritance.repository;

import com.springboot.learn.Day_01_04_table_per_class_inheritance.entity.WildPet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WildPetRepository extends JpaRepository<WildPet, Long> {
}
