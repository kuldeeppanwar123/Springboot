package com.springboot.learn.Day_03_01_many_to_many_association;

import com.springboot.learn.Day_03_01_many_to_many_association.entity.Course;
import com.springboot.learn.Day_03_01_many_to_many_association.entity.Student;
import com.springboot.learn.Day_03_01_many_to_many_association.repository.CourseRepository;
import com.springboot.learn.Day_03_01_many_to_many_association.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void run(String ...args) {
//        Student student = new Student();
//        student.setName("Kuldeep");
//        student.setAge(23);
//        Course course = new Course();
//        course.setName("DSA");
//        course.setPrice(4999.0);
//        student.setCourses(List.of(course));

//        Course course2 = new Course();
//        course2.setName("Java");
//        course2.setPrice(9999.5);
//        Optional<Student> student = studentRepository.findById(1L);
//        List<Course>studentCourses = new ArrayList<>(student.get().getCourses());
//        studentCourses.add(course2);
//        student.get().setCourses(studentCourses);
//        studentRepository.save(student.get());

//        Optional<Course>course = courseRepository.findById(1L);
//        Student student = new Student();
//        student.setName("Jaydeep");
//        student.setAge(22);
//        student.setCourses(List.of(course.get()));
//        studentRepository.save(student);

//        Optional<Student>student = studentRepository.findById(1L);
//        System.out.println(student.get());

//        Optional<Course>course = courseRepository.findById(1L);
//        System.out.println(course.get());
    }
}
