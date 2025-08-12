package com.greenleaf.greenleaf.config;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import com.greenleaf.greenleaf.models.Product;
import com.greenleaf.greenleaf.repository.ProductRepository;

@Component
public class DataInitializer {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void initData() {
        if (productRepository.count() == 0) {
            productRepository.save(new Product(null, "Laptop", "Gaming Laptop", 1500.0, 10));
            productRepository.save(new Product(null, "Phone", "Smartphone", 800.0, 20));
            productRepository.save(new Product(null, "Headphones", "Noise Cancelling", 200.0, 15));
        }
    }
}
