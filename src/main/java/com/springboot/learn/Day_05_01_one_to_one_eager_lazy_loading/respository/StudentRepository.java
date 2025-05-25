package com.springboot.learn.Day_05_01_one_to_one_eager_lazy_loading.respository;

import com.springboot.learn.Day_05_01_one_to_one_eager_lazy_loading.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
