package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table;

import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Course;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Enrollment;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.EnrollmentId;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Student;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.CourseRepository;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.EnrollmentRepository;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public void run(String... args) {
        System.out.println("Application running...");

//        Student student = new Student();
//        student.setName("Kuldeep");
//        studentRepository.save(student);
//
//        Course course = new Course();
//        course.setName("B. Tech");
//        courseRepository.save(course);
//
//        EnrollmentId enrollmentId = new EnrollmentId();
//        enrollmentId.setStudentId(student.getId());
//        enrollmentId.setCourseId(course.getId());
//
//        Enrollment enrollment = new Enrollment();
//        enrollment.setId(enrollmentId);
//        enrollment.setStudent(student);
//        enrollment.setCourse(course);
//        enrollmentRepository.save(enrollment);
    }
}
