package com.springboot.learn.Day_01_05_joined_table_inheritance.repository;

import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
