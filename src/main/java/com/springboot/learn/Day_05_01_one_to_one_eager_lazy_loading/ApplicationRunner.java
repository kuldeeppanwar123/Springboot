package com.springboot.learn.Day_05_01_one_to_one_eager_lazy_loading;

import com.springboot.learn.Day_05_01_eager_loading.entity.Laptop;
import com.springboot.learn.Day_05_01_eager_loading.entity.Student;
import com.springboot.learn.Day_05_01_eager_loading.respository.LaptopRepository;
import com.springboot.learn.Day_05_01_eager_loading.respository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Transactional
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LaptopRepository laptopRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student();
//        student.setName("Kuldeep");
//        Laptop laptop = new Laptop();
//        laptop.setName("HP");
//        laptop.setStudent(student);
//        laptopRepository.save(laptop);

        Optional<Laptop>laptop = laptopRepository.findById(1L);
//        Optional<Student>student = studentRepository.findById(2L);

        System.out.println(laptop.get());
//        System.out.println(student.get());
    }
}
