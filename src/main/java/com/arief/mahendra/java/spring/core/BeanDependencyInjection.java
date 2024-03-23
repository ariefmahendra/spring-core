package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Bar;
import com.arief.mahendra.java.spring.core.data.Foo;
import com.arief.mahendra.java.spring.core.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencyInjection {

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

}
