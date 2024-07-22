package com.springcore.constructorinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class ConstructorInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/config/beans.xml");
        Car car = (Car) context.getBean(Car.class);

        Engine engine = car.getEngine();

        System.out.println(engine.getName());
        System.out.println(engine.getYear());
    }

}
