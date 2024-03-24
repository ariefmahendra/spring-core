package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Connection;
import com.arief.mahendra.java.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleBean {

    @Bean
    public Connection connection(){
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
