package com.springboot.learn.Day_02_02_one_to_one_association;

import com.springboot.learn.Day_02_02_one_to_one_association.entity.Laptop;
import com.springboot.learn.Day_02_02_one_to_one_association.entity.Student;
import com.springboot.learn.Day_02_02_one_to_one_association.repository.LaptopRepository;
import com.springboot.learn.Day_02_02_one_to_one_association.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LaptopRepository laptopRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Day 02 02 runner.....");

        Student student = new Student();
        Laptop laptop = new Laptop();
        laptop.setBrand("HP");
        laptop.setPrice(3000.44);
        student.setName("kuldeep");
        student.setLaptop(laptop);
        studentRepository.save(student);

        studentRepository.deleteById(1L);

    }
}
