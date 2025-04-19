package com.springboot.learn.Day_01_03_single_table_inheritance.repository;

import com.springboot.learn.Day_01_03_single_table_inheritance.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
