package com.spingcore.scopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopesApplication {

    public static void main(String[] args) {

//            SpringApplication.run(ScopesApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person personA = (Person) context.getBean("personsingleton");
        Person personB = (Person) context.getBean("personsingleton");

        personA.setName("La Hong Vi");
        System.out.println(personA.getName());
        System.out.println(personB.getName());
    }

}
