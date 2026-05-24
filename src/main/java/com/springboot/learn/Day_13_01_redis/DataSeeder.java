package com.springboot.learn.Day_13_01_redis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            log.info("Seeding 5 products...");
            productRepository.saveAll(List.of(
                Product.builder().name("Laptop").description("High performance laptop").price(new BigDecimal("999.99")).category("Electronics").createdDate(LocalDateTime.now()).build(),
                Product.builder().name("Phone").description("Latest smartphone").price(new BigDecimal("699.99")).category("Electronics").createdDate(LocalDateTime.now()).build(),
                Product.builder().name("Desk Chair").description("Ergonomic office chair").price(new BigDecimal("299.99")).category("Furniture").createdDate(LocalDateTime.now()).build(),
                Product.builder().name("Headphones").description("Noise cancelling headphones").price(new BigDecimal("199.99")).category("Electronics").createdDate(LocalDateTime.now()).build(),
                Product.builder().name("Coffee Mug").description("Ceramic coffee mug").price(new BigDecimal("14.99")).category("Kitchen").createdDate(LocalDateTime.now()).build()
            ));
            log.info("Seeding complete.");
        } else {
            log.info("Products already exist, skipping seeding.");
        }
    }
}
