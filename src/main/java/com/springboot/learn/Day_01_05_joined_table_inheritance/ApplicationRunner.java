package com.springboot.learn.Day_01_05_joined_table_inheritance;

import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Employee;
import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Person;
import com.springboot.learn.Day_01_05_joined_table_inheritance.entity.Student;
import com.springboot.learn.Day_01_05_joined_table_inheritance.repository.EmployeeRepository;
import com.springboot.learn.Day_01_05_joined_table_inheritance.repository.PersonRepository;
import com.springboot.learn.Day_01_05_joined_table_inheritance.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private PersonRepository personRepository;
    private StudentRepository studentRepository;
    private EmployeeRepository employeeRepository;

    public ApplicationRunner(PersonRepository personRepository, StudentRepository studentRepository, EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.personRepository = personRepository;
        this.studentRepository = studentRepository;
    }

    public void run(String ...args) {
        System.out.println("day 05 application running....");

        Person person = new Person();
        person.setName("Radha");

        Student student = new Student();
        student.setName("Kuldeep");
        student.setSchool("SDPS school");
        student.setFees(30000.33);

        Employee employee = new Employee();
        employee.setName("Naresh");
        employee.setCompany("Gammastack");
        employee.setSalary(44444.555);

        personRepository.save(person);
        studentRepository.save(student);
        employeeRepository.save(employee);
    }
}
