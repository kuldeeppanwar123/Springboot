package com.springboot.learn.Day_01_01_mappedsuperclass.repository;

import com.springboot.learn.Day_01_01_mappedsuperclass.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
