package com.springboot.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocApplication.class, args);
    }

//      1
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		MyBean myBean = (MyBean) context.getBean("myBean");
//		myBean.printMessage();

//		2
//		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		MyBean myBean = (MyBean) context.getBean("myBean");
//		myBean.printMessage();

//      3
//		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
//		annotationContext.register(AppConfig.class);
//		annotationContext.refresh();
//		MyBean myBean = (MyBean) annotationContext.getBean("myBean");
//		myBean.printMessage()

//  	AnnotationConfigApplicationContext   ClassPathXmlApplicationContext   FileSystemXmlApplicationContext

}
