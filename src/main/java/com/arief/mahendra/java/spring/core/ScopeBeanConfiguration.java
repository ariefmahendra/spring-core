package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeBeanConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Foo foo(){
        System.out.println("created new foo");
        return new Foo();
    }

}
