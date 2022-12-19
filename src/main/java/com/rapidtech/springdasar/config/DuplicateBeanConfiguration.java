package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {

    @Primary
    @Bean(value = "foo1")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "foo2")
    public Foo foo2(){
        return new Foo();
    }
}
