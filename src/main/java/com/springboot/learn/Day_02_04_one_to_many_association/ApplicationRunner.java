package com.springboot.learn.Day_02_04_one_to_many_association;

import com.springboot.learn.Day_02_04_one_to_many_association.entity.School;
import com.springboot.learn.Day_02_04_one_to_many_association.entity.Student;
import com.springboot.learn.Day_02_04_one_to_many_association.repository.SchoolRepository;
import com.springboot.learn.Day_02_04_one_to_many_association.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    @Transactional
    public void run(String ...args) {
        System.out.println("day 02 04 application runner...");
//        Student student = new Student();
//        student.setName("Kuldeep");
//        School school = new School();
//        school.setName("SDPS public school");
//        schoolRepository.save(school);
//        student.setSchool(school);
//        studentRepository.save(student);

//        Optional<School> school = schoolRepository.findById(1);
//        Student student = new Student();
//        student.setName("Jaydeep");
//        student.setSchool(school.get());
//        studentRepository.save(student);

        Optional<School> school = schoolRepository.findById(1);
        System.out.println("school...............");
        System.out.println(school.get().toString());
    }
}
