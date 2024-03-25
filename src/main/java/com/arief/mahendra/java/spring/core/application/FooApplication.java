package com.arief.mahendra.java.spring.core.application;

import com.arief.mahendra.java.spring.core.data.Foo;
import com.arief.mahendra.java.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
// membaca base bean di current directory application spring boot
public class FooApplication {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    //    public static void main(String[] args) {
    //        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
    //
    //        Foo foo = applicationContext.getBean(Foo.class);
    //
    //        System.out.println(foo);
    //    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FooApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setListeners(List.of(
                new AppStartingListener()
        ));

        ConfigurableApplicationContext applicationContext = springApplication.run(args);
        Foo foo = applicationContext.getBean(Foo.class);

        System.out.println(foo);
    }
}
