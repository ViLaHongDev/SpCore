package com.springcore.setterbaserddi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Sim sim(){
        return new Viettel();
    }

    @Bean
    public Store store(){
        Store store = new Store();
        store.setSim(sim());
        return store;
    }
}
