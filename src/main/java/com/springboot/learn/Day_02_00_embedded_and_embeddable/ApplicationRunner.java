package com.springboot.learn.Day_02_00_embedded_and_embeddable;

import com.springboot.learn.Day_02_00_embedded_and_embeddable.entity.Company;
import com.springboot.learn.Day_02_00_embedded_and_embeddable.entity.ContactPerson;
import com.springboot.learn.Day_02_00_embedded_and_embeddable.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private CompanyRepository companyRepository;

    public void run(String... args) {
        System.out.println("day 02 00 runner...");

        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setFirstName("Kuldeep");
        contactPerson.setLastName("Panwar");
        contactPerson.setPhone("7777777777");

        Company company = new Company();
        company.setName("Gammastack");
        company.setAddress("Indore mp");
        company.setContactPerson(contactPerson);

        companyRepository.save(company);
    }
}
