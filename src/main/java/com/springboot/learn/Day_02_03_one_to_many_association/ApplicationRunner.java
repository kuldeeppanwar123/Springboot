package com.springboot.learn.Day_02_03_one_to_many_association;

import com.springboot.learn.Day_02_03_one_to_many_association.entity.School;
import com.springboot.learn.Day_02_03_one_to_many_association.entity.Student;
import com.springboot.learn.Day_02_03_one_to_many_association.repository.SchoolRepository;
import com.springboot.learn.Day_02_03_one_to_many_association.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    public void run(String... args) throws Exception {
        System.out.println("day 02 03 application running...");
        Student student1 = new Student();
        student1.setName("Kuldeep");
        School school = new School();
        school.setName("SDPS school");

        studentRepository.save(student1);
        school.setStudents(List.of(student1));
        schoolRepository.save(school);
    }
}
