package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Car;
import com.arief.mahendra.java.spring.core.processor.IdGeneratorPostProcessor;
import com.arief.mahendra.java.spring.core.processor.PrefixIdGeneratorPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedTest {

    @Configuration
    @Import({
            Car.class, IdGeneratorPostProcessor.class, PrefixIdGeneratorPostProcessor.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOrdered() {

        Car car = applicationContext.getBean(Car.class);

        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PREFIX-"));

    }
}
