package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.Client.PaymentGatewayClient;
import com.arief.mahendra.java.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertSame(paymentGatewayClient.getEndpoint(), "https://example.com");
        Assertions.assertSame(paymentGatewayClient.getPrivateKey(), "private");
        Assertions.assertSame(paymentGatewayClient.getPublicKey(), "public");
    }
}
