package com.springboot.learn.Day_03_04_many_to_many_association_via_join_model;

import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.entity.Course;
import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.entity.Registration;
import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.entity.Student;
import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.repository.CourseRepository;
import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.repository.RegistrationRepository;
import com.springboot.learn.Day_03_04_many_to_many_association_via_join_model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RegistrationRepository registrationRepository;

    public void run(String... args) {
        System.out.println("Application running...");
        Student student = new Student();
        student.setName("Kuldeep");
        studentRepository.save(student);

        Course course = new Course();
        course.setName("DSA");
        courseRepository.save(course);

        Registration registration = new Registration();
        registration.setStudent(student);
        registration.setCourse(course);
        registrationRepository.save(registration);
    }
}
