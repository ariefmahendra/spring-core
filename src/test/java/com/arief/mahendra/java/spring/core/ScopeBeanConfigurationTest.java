package com.arief.mahendra.java.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeBeanConfigurationTest {
    @Test
    void testPrototype() {

        ApplicationContext foo1 = new AnnotationConfigApplicationContext(ScopeBeanConfiguration.class);
        ApplicationContext foo2 = new AnnotationConfigApplicationContext(ScopeBeanConfiguration.class);
        ApplicationContext foo3 = new AnnotationConfigApplicationContext(ScopeBeanConfiguration.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo2, foo3);
        Assertions.assertNotSame(foo3, foo1);
    }
}
