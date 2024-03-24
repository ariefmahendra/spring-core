package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Bar;
import com.arief.mahendra.java.spring.core.data.Foo;
import com.arief.mahendra.java.spring.core.scope.DoubletonScope;
import jdk.jfr.Registered;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeBeanConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Foo foo(){
        System.out.println("created new foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
        scopeConfigurer.addScope("doubleton", new DoubletonScope());
        return scopeConfigurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        System.out.println("Create new bar");
        return new Bar();
    }
}
