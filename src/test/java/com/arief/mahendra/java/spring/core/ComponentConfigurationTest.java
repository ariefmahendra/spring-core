package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.repository.CategoryRepository;
import com.arief.mahendra.java.spring.core.repository.CustomerRepository;
import com.arief.mahendra.java.spring.core.repository.ProductRepository;
import com.arief.mahendra.java.spring.core.service.CategoryService;
import com.arief.mahendra.java.spring.core.service.CustomerService;
import com.arief.mahendra.java.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentConfigurationTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        Assertions.assertNotNull(productRepository);

        ProductService productService = applicationContext.getBean(ProductService.class);
        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDI() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldInjection() {
        CustomerRepository customerRepository1 = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);

        CustomerRepository customerRepository2 = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        Assertions.assertSame(customerRepository1, customerService.getNormalCustomerRepository());
        Assertions.assertSame(customerRepository2, customerService.getPremiumCustomerRepository());
    }

}
