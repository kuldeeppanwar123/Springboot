package com.springboot.learn.Day_03_01_many_to_many_association.controller;

import com.springboot.learn.Day_03_01_many_to_many_association.entity.Course;
import com.springboot.learn.Day_03_01_many_to_many_association.entity.Student;
import com.springboot.learn.Day_03_01_many_to_many_association.repository.CourseRepository;
import com.springboot.learn.Day_03_01_many_to_many_association.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentController(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public Student saveStudentCourse(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> findStudent(@PathVariable Long studentId) {
        return studentRepository.findById(studentId);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Student> findStudentsContainingByName(@PathVariable String name) {
       return studentRepository.findByNameContaining(name);
    }

    @GetMapping("/course/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price) {
        return courseRepository.findByPriceLessThan(price);
    }
}
