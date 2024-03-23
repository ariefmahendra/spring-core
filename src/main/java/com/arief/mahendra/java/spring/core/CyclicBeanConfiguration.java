package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.CyclicA;
import com.arief.mahendra.java.spring.core.data.CyclicB;
import com.arief.mahendra.java.spring.core.data.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicBeanConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
