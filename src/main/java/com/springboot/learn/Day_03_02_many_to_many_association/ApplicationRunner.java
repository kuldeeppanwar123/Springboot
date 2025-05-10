package com.springboot.learn.Day_03_02_many_to_many_association;

import com.springboot.learn.Day_03_02_many_to_many_association.entity.Employee;
import com.springboot.learn.Day_03_02_many_to_many_association.entity.Project;
import com.springboot.learn.Day_03_02_many_to_many_association.repository.EmployeeRepository;
import com.springboot.learn.Day_03_02_many_to_many_association.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
   private EmployeeRepository employeeRepository;
    @Autowired
   private ProjectRepository projectRepository;

    @Override
    public void run(String ...args) {
        System.out.println("Application running...");

        Project sephoraProject = new Project();
        sephoraProject.setName("Sephora");
//        projectRepository.save(sephoraProject);

        Project betskiProject = new Project();
        betskiProject.setName("Betski");
//        projectRepository.save(betskiProject);

        Project stakeProject  = new Project();
        stakeProject.setName("Stake");
//        projectRepository.save(stakeProject);

        Employee rahulEmployee = new Employee();
        rahulEmployee.setName("Rahul");
        rahulEmployee.setSalary(300000.33);

        Employee jayEmployee = new Employee();
        jayEmployee.setName("Jay");
        jayEmployee.setSalary(44444.55);

        jayEmployee.setProjects(Set.of(sephoraProject, betskiProject));
        employeeRepository.save(jayEmployee);
    }
}
