package com.springboot.learn.Day_01_01_mappedsuperclass;

import com.springboot.learn.Day_01_01_mappedsuperclass.entity.Laptop;
import com.springboot.learn.Day_01_01_mappedsuperclass.entity.Student;
import com.springboot.learn.Day_01_01_mappedsuperclass.repository.LaptopRepository;
import com.springboot.learn.Day_01_01_mappedsuperclass.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    LaptopRepository laptopRepository;
    StudentRepository studentRepository;

    public ApplicationRunner(StudentRepository studentRepository, LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
        this.studentRepository = studentRepository;
    }
    public void run(String... arg) throws Exception {
        System.out.println("application runner runing.....................");
        Student student = Student.builder()
                .name("Kuldeep")
                .age(23)
                .build();
        studentRepository.save(student);

        Laptop laptop = Laptop.builder()
                .name("DELL")
                .price(200000L)
                .build();

        laptopRepository.save(laptop);
    }
}
