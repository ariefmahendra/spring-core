package com.arief.mahendra.java.spring.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class LogCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("log command line runner : {}", Arrays.toString(args));
    }
}
