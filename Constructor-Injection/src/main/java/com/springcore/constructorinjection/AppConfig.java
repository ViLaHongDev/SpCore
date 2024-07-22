package com.springcore.constructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Engine engine(){
        return new Engine("v8",5);
    }
    @Bean
    public Engine engine1(){
        return new Engine("v1",2);
    }
    @Bean
    public Transmission transmission(){
        return new Transmission("sliding");
    }
}
