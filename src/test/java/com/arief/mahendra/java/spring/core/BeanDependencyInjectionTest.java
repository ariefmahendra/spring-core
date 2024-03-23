package com.arief.mahendra.java.spring.core;

import com.arief.mahendra.java.spring.core.data.Bar;
import com.arief.mahendra.java.spring.core.data.Foo;
import com.arief.mahendra.java.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDependencyInjectionTest {

    @Test
    void testBeanDI() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjection.class);

        FooBar fooBar = applicationContext.getBean(FooBar.class);
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);

        Assertions.assertSame(fooBar.getBar(), bar);
        Assertions.assertSame(fooBar.getFoo(), foo);
    }

    @Test
    void testBeanDIWithSelectBean() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjection.class);

        FooBar fooBar = applicationContext.getBean(FooBar.class);
        Foo foo = applicationContext.getBean("fooSecond",Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);

        Assertions.assertSame(fooBar.getBar(), bar);
        Assertions.assertSame(fooBar.getFoo(), foo);
    }
}
