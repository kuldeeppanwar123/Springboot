package com.springboot.learn.Day_12_01_mapstruct.repository;

import com.springboot.learn.Day_12_01_mapstruct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
