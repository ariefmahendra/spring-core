package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.configuration.BarConfiguration;
import com.arief.mahendra.java.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
