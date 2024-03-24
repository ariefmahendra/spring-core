package com.arief.mahendra.java.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.arief.mahendra.java.spring.core.configuration"
})
public class ScanConfiguration {
}
