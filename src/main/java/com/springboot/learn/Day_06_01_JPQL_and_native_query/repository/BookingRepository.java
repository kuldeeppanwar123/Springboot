package com.springboot.learn.Day_06_01_JPQL_and_native_query.repository;

import com.springboot.learn.Day_06_01_JPQL_and_native_query.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
