package com.springboot.learn.Day_02_04_one_to_many_association.repository;

import com.springboot.learn.Day_02_04_one_to_many_association.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
