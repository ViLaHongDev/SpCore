package com.springcore.setterbaserddi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SetterBaserdDiApplication {

    public static void main(String[] args) {

//        SpringApplication.run(SetterBaserdDiApplication.class, args);


         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            Viettel viettel = (Viettel) context.getBean("sim");
            viettel.calling();
            viettel.data();
            Store store = (Store) context.getBean("store");
            System.out.println(store.getSim());

//        ApplicationContext context = new ClassPathXmlApplicationContext("/config/beans.xml");
//        Viettel viettel = (Viettel) context.getBean("sim");
//        viettel.calling();
//        viettel.data();
//
//        Store store = (Store) context.getBean("store");
//        System.out.println(store.getSim());

    }

}
