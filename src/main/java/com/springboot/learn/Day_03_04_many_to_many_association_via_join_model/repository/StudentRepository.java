package com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.repository;

import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
