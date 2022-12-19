package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Bar;
import com.rapidtech.springdasar.model.Foo;
import com.rapidtech.springdasar.model.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar());
    }
}
