package com.springboot.learn.Day_01_02_single_table_inheritance.repository;

import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
