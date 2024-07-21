package com.springcore.componentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComponentScanApplication {

    public static void main(String[] args) {

        // SpringApplication.run(ComponentScanApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

    }
}
