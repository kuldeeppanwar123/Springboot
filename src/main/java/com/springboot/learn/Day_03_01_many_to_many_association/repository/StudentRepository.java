package com.springboot.learn.Day_03_01_many_to_many_association.repository;

import com.springboot.learn.Day_03_01_many_to_many_association.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
