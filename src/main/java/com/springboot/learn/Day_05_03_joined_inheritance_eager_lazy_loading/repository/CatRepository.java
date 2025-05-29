package com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.repository;

import com.springboot.learn.Day_05_03_joined_inheritance_eager_lazy_loading.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
