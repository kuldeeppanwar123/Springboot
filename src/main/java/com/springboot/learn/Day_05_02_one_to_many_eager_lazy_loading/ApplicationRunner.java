package com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading;

import com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.entity.Course;
import com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.entity.Student;
import com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.repository.CourseRepository;
import com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student();
//        student.setName("Ram");
//
//        Course course = new Course();
//        course.setName("B.Tech");
//        course.setStudent(student);
//        Course course2 = new Course();
//        course2.setName("BCA");
//        course2.setStudent(student);
//
//        student.setCourses(List.of(course, course2));
//        studentRepository.save(student);

        Optional<Student>student = studentRepository.findById(2L);
        System.out.println(student.get());

//        Optional<Course>course = courseRepository.findById(3L);
//        System.out.println(course.get());
    }
}
