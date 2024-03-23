package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {

    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    }
}
