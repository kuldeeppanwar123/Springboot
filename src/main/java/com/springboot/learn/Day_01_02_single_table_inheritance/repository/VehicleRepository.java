package com.springboot.learn.Day_01_02_single_table_inheritance.repository;

import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
