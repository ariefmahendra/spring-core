package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.listener.LoginAgainSuccessListener;
import com.arief.mahendra.java.spring.core.listener.LoginSuccessListener;
import com.arief.mahendra.java.spring.core.listener.UserListener;
import com.arief.mahendra.java.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            LoginSuccessListener.class,
            UserService.class,
            LoginAgainSuccessListener.class,
            UserListener.class
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
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("arief", "arief");
        userService.login("arief", "salah");
        userService.login("mahendra", "salah");
    }
}
