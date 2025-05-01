package com.springboot.learn.Day_02_01_one_to_one_association;

import com.springboot.learn.Day_02_01_one_to_one_association.entity.Laptop;
import com.springboot.learn.Day_02_01_one_to_one_association.entity.Student;
import com.springboot.learn.Day_02_01_one_to_one_association.repository.LaptopRepository;
import com.springboot.learn.Day_02_01_one_to_one_association.repository.StudentRepository;
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
    LaptopRepository laptopRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("day 02 01 application running");

        Student student = new Student();
        student.setName("Jaydeep");
        Laptop laptop = new Laptop();
        laptop.setBrand("DELL");
        laptop.setPrice(400L);
        laptopRepository.save(laptop);
        student.setLaptop(laptop);
        studentRepository.save(student);

        List<Student>students = studentRepository.findAll();
        System.out.println("List of students: ");
        for (Student std : students) {
            System.out.println(std.toString());
        }
        System.out.println("Student with id 1");
        Optional<Student>std1 = studentRepository.findById(1L);
        System.out.println(std1.get().toString());
    }
}
