package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.CyclicA;
import com.arief.mahendra.java.spring.core.data.CyclicB;
import com.arief.mahendra.java.spring.core.data.CyclicC;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic() {
        try {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicBeanConfiguration.class);
        Assertions.fail("it must be fail because cyclic");
        } catch (BeansException e){
            e.printStackTrace();
        }
    }
}
