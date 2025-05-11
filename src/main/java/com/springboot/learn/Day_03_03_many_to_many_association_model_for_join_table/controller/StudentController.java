package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.controller;

import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Course;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Student;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.EnrollmentRepository;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollment")
@RequiredArgsConstructor
public class StudentController {
    private final EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    public ResponseEntity<?> enrollStudent(
            @RequestParam String studentName,
            @RequestParam String courseName
    ) {
        enrollmentService.enrollStudentInCourse(studentName, courseName);
        return ResponseEntity.status(HttpStatus.CREATED).body("student enrolled in course successfully!");
    }

    @GetMapping("/student/{studentId}/courses")
    public ResponseEntity<List<Course>> getCoursesForStudent(@PathVariable Long studentId) {
        return ResponseEntity.status(HttpStatus.OK).body(enrollmentService.getCourseForStudent(studentId));
    }

    @GetMapping("/course/{courseId}/students")
    public ResponseEntity<List<Student>> getStudentsForCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(enrollmentService.getStudentsForCourse(courseId));
    }
}
