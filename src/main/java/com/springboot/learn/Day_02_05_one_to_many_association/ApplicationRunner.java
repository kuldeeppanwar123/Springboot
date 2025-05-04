package com.springboot.learn.Day_02_05_one_to_many_association;

import com.springboot.learn.Day_02_05_one_to_many_association.entity.School;
import com.springboot.learn.Day_02_05_one_to_many_association.entity.Student;
import com.springboot.learn.Day_02_05_one_to_many_association.repository.SchoolRepository;
import com.springboot.learn.Day_02_05_one_to_many_association.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;
    @Override
//    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("day 02 05 application runner...");

//        Student student1 = new Student();
//        Student student2 = new Student();
//        School school = new School();
//        student1.setName("Kuldeep");
//        student2.setName("Jay");
//        school.setName("SDPS school");
//        student1.setSchool(school);
//        student2.setSchool(school);
//        school.setStudents(List.of(student1, student2));
//        schoolRepository.save(school);

        Optional<School> school = schoolRepository.findById(1);
        System.out.println(school.get().toString());
    }
}
