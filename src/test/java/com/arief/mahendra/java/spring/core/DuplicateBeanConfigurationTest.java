package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
    }

    @Test
    void testDuplicateBeanConfiguration() {

        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
