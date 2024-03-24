package com.arief.mahendra.java.spring.core.data;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void start(){
        log.info("server is started");
    }

    public void stop(){
        log.info("server is down");
    }
}
