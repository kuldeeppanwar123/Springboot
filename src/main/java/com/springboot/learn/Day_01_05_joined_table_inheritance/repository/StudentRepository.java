package com.springboot.learn.Day_01_05_joined_table_inheritance.repository;

import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
