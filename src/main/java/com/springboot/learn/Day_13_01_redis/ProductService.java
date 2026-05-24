package com.springboot.learn.Day_13_01_redis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private static final String CACHE_PREFIX = "product:";
    private static final long TTL = 300L;

    private final ProductRepository productRepository;
    private final RedisService redisService;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Long id) {
        String key = CACHE_PREFIX + id;
        Product cached = redisService.get(key, Product.class);
        if (cached != null) return cached;

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
        redisService.set(key, product, TTL);
        return product;
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product updated) {
        Product existing = getById(id);
        existing.setName(updated.getName());
        existing.setDescription(updated.getDescription());
        existing.setPrice(updated.getPrice());
        existing.setCategory(updated.getCategory());
        Product saved = productRepository.save(existing);
        redisService.set(CACHE_PREFIX + id, saved, TTL);
        return saved;
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    private void simulateSlowDatabaseCall() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
