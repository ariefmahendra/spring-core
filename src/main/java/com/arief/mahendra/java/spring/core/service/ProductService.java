package com.arief.mahendra.java.spring.core.service;

import com.arief.mahendra.java.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
