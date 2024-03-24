package com.arief.mahendra.java.spring.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    public void start(){
        log.info("server is started");
    }

    @PreDestroy
    public void stop(){
        log.info("server is down");
    }
}
