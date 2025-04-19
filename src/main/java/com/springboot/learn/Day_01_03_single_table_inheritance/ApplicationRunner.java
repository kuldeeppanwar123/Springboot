package com.springboot.learn.Day_01_03_single_table_inheritance;

import com.springboot.learn.Day_01_03_single_table_inheritance.entity.ContractEmployee;
import com.springboot.learn.Day_01_03_single_table_inheritance.entity.PermanentEmployee;
import com.springboot.learn.Day_01_03_single_table_inheritance.repository.ContractEmployeeRepository;
import com.springboot.learn.Day_01_03_single_table_inheritance.repository.EmployeeRepository;
import com.springboot.learn.Day_01_03_single_table_inheritance.repository.PermanentEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    PermanentEmployeeRepository permanentEmployeeRepository;
    @Autowired
    ContractEmployeeRepository contractEmployeeRepository;

    public void run(String... args) throws Exception{
        System.out.println("Day-01-03-app-runner");
        PermanentEmployee permanentEmployee = PermanentEmployee.builder()
                .employeeId(100)
                .name("Kuldeep")
                .build();

        ContractEmployee contractEmployee = ContractEmployee.builder()
                .contractPeriod(18)
                .name("Kuldeeep")
                .build();

        permanentEmployeeRepository.save(permanentEmployee);
        contractEmployeeRepository.save(contractEmployee);

        List<PermanentEmployee>permanentEmployees = employeeRepository.findAll()
                .stream()
                .filter(e-> e instanceof PermanentEmployee)
                .map(e -> (PermanentEmployee) e)
                .collect(Collectors.toList());
        System.out.println("===============Permanent employees=================");
        System.out.println(permanentEmployees);

        List<ContractEmployee>contractEmployees = employeeRepository.findAll()
                .stream()
                .filter(e-> e instanceof ContractEmployee)
                .map(e-> (ContractEmployee) e)
                .collect(Collectors.toList());

        System.out.println("===============Contract employees=================");
        System.out.println(contractEmployees);
    }


}
