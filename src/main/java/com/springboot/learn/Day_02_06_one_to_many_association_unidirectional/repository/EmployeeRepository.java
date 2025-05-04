package com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.repository;

import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
