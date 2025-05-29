package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.repository;

import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
