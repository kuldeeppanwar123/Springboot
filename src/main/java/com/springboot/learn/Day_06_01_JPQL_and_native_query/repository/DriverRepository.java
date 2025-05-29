package com.springboot.learn.Day_06_01_JPQL_and_native_query.repository;

import com.springboot.learn.Day_06_01_JPQL_and_native_query.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByIdAndLicenseNo(Long id, String license);

    @Query(nativeQuery = true, value = "SELECT * FROM Driver WHERE id=:id AND license_no=:license")
    Optional<Driver> rawFindByIdAndLicenseNo(Long id, String licenseNo);

    @Query("SELECT d FROM Driver d WHERE d.id = :id AND d.licenseNo=:license")
    Optional<Driver> rawFindByIdAndlicenseNo2(Long id, String license);

    Optional<List<Driver>> findAllByIdIn(List<Long>driverIds);
}
