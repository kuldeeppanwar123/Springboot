package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.service;

import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Course;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Enrollment;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.EnrollmentId;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity.Student;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.CourseRepository;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.EnrollmentRepository;
import com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EnrollmentService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final EnrollmentRepository enrollmentRepository;

    public void enrollStudentInCourse(String studentName, String courseName) {
        Student student = studentRepository.findByName(studentName)
                .orElseGet(() -> {
                    Student s = new Student();
                    s.setName(studentName);
                    return studentRepository.save(s);
                });

        Course course = courseRepository.findByName(courseName)
                .orElseGet(() -> {
                    Course c = new Course();
                    c.setName(courseName);
                    return courseRepository.save(c);
                });

        EnrollmentId enrollmentId = new EnrollmentId();
        enrollmentId.setCourseId(course.getId());
        enrollmentId.setStudentId(student.getId());

        if(!enrollmentRepository.existsById(enrollmentId)) {
            Enrollment enrollment = new Enrollment();
            enrollment.setId(enrollmentId);
            enrollment.setStudent(student);
            enrollment.setCourse(course);

            enrollmentRepository.save(enrollment);
        }
    }

    public List<Course> getCourseForStudent (Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found!"));

        return student.getEnrollments().stream()
                .map(Enrollment::getCourse)
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsForCourse(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found!"));
        return course.getEnrollments().stream()
                .map(Enrollment::getStudent)
                .collect(Collectors.toList());
    }
}
