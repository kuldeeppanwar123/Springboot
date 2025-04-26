package com.springboot.learn.Day_01_04_table_per_class_inheritance;

import com.springboot.learn.Day_01_04_table_per_class_inheritance.entity.DomesticPet;
import com.springboot.learn.Day_01_04_table_per_class_inheritance.entity.Pet;
import com.springboot.learn.Day_01_04_table_per_class_inheritance.entity.WildPet;
import com.springboot.learn.Day_01_04_table_per_class_inheritance.repository.DomesticPetRepository;
import com.springboot.learn.Day_01_04_table_per_class_inheritance.repository.PetRepository;
import com.springboot.learn.Day_01_04_table_per_class_inheritance.repository.WildPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private DomesticPetRepository domesticPetRepository;
    @Autowired
    private WildPetRepository wildPetRepository;

    public void run(String...args) {
        System.out.println("Day 04 app runner");
        Pet pet = new Pet(null, "tommy", "male");

        DomesticPet domesticPet = DomesticPet.builder()
                .name("raju")
                .gender("male")
                .dateOfBirth(new Date())
                .build();

        WildPet wildPet = WildPet.builder()
                .name("kaju")
                .gender("male")
                .placeOfBirth("GB road")
                .build();

        petRepository.save(pet);
        domesticPetRepository.save(domesticPet);
        wildPetRepository.save(wildPet);
    }


}
