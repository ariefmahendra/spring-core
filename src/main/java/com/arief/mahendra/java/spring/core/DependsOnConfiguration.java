package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Bar;
import com.arief.mahendra.java.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn(value = "bar")
    public Foo foo(){
        System.out.println("Created new foo");
        return new Foo();
    }


    // bar create first
    @Bean
    public Bar bar(){
        System.out.println("created new bar");
        return new Bar();
    }
}
