package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository;

import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
   public Optional<Student> findByName(String studentName);
}
