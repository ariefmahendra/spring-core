package com.arief.mahendra.java.spring.core.configuration;

import com.arief.mahendra.java.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
