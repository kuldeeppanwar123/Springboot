package com.springboot.learn.Day_02_06_one_to_many_association_unidirectional;

import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity.Department;
import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.entity.Employee;
import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.repository.DepartmentRepository;
import com.springboot.learn.Day_02_06_one_to_many_association_unidirectional.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    public void run(String ...arg) {
        System.out.println("day 02 06 application runner...");

//        Department department = new Department();
//        Employee employee = new Employee();
//        department.setName("finanance");
//        employee.setName("Kuldeep");
//        department.setEmployees(List.of(employee));
//        departmentRepository.save(department);

//        Optional<Department>department = departmentRepository.findById(2L);
//        Employee employee = new Employee();
//        employee.setName("Jay");
//        department.get().getEmployees().add(employee);
//        departmentRepository.save(department.get());

//        Optional<Department> department = departmentRepository.findById(2L);
//        System.out.println(department.get());

        Optional<Employee> employee = employeeRepository.findById(2L);
        System.out.println(employee.get());
    }
}
