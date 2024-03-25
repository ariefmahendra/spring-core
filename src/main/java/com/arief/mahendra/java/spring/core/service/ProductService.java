package com.arief.mahendra.java.spring.core.service;

import com.arief.mahendra.java.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ProductService {

    private ProductRepository productRepository;

    @Autowired // set default constructor when initialize bean object
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
