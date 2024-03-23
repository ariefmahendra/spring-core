package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChangeNameBeanConfigurationTest {

    @Test
    void testPrimaryBeanConfiguration() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ChangeNameBeanConfiguration.class);
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
        Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
    }
}
