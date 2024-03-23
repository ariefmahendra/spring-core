package com.arief.mahendra.java.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void testDatabaseSingleton() {

        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();

        Assertions.assertEquals(instance1, instance2);
    }
}
