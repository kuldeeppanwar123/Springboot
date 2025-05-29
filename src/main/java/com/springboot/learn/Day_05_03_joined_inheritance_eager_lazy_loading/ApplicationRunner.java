package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading;

import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity.Animal;
import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity.Cat;
import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity.Dog;
import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.repository.AnimalRepository;
import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.repository.CatRepository;
import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.OptionalInt;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    CatRepository catRepository;
    @Autowired
    DogRepository dogRepository;
    @Override
    public void run(String... args) throws Exception {
//        Dog d = new Dog();
//        d.setBreed("russian");
//        d.setAnimalType("DOG");
//
//        Cat c = new Cat();
//        c.setAnimalType("CAT");
//        c.setAge(22);
//
//        Animal a = new Animal();
//        a.setAnimalType("LION");
//
//        animalRepository.save(a);
//        dogRepository.save(d);
//        catRepository.save(c);

        Optional<Animal> animal = animalRepository.findById(1L);
        Optional<Dog> dog = dogRepository.findById(2L);
        Optional<Cat>cat = catRepository.findById(3L);

        System.out.println(animal.get());
        System.out.println(dog.get());
        System.out.println(cat.get());
    }
}
