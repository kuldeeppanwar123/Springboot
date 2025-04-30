package com.springboot.learn.Day_01_05_joined_table_inheritance.repository;

import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
