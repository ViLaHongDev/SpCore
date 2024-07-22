package com.springcore.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.componentscan.animal")
public class AppConfig {
        @Bean
        public ExampleBean exampleBean(){
            return new ExampleBean();
        }
}
