package com.springcore.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {

//      SpringApplication.run(DiApplication.class, args);

//        1 App Configuration
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Viettel viettel = (Viettel) context.getBean("sim");
//        Store store = (Store) context.getBean("store");
//
//        viettel.data();
//        viettel.calling();
//
//        System.out.println(store.getSim());

//        2 XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("/config/beans.xml");
//        Viettel viettel = (Viettel) context.getBean("sim");
//        viettel.calling();
//        viettel.data();
//        Store store = (Store) context.getBean("store");
//        System.out.println(store.getSim());

        }

}
