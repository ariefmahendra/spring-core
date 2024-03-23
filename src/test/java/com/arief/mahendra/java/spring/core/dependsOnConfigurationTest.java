package com.arief.mahendra.java.spring.core;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class dependsOnConfigurationTest {

    @Test
    void testDependOn() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
}
