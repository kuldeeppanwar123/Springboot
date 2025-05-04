package com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.repository;

import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
