package com.springboot.learn.Day_01_03_single_table_inheritance.repository;

import com.springboot.learn.Day_01_03_single_table_inheritance.entity.PermanentEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermanentEmployeeRepository extends JpaRepository<PermanentEmployee, Long> {
}
