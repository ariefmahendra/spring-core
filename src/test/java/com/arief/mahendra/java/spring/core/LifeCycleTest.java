package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Connection;
import com.arief.mahendra.java.spring.core.data.Server;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleBean.class);
    }

    @Test
    void testLifeCycle() {
        Connection connection = applicationContext.getBean(Connection.class);
        applicationContext.close();
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}
