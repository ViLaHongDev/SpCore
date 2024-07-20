package com.spingcore.scopes;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;


public class givenSingletonScope_whensetName_thenEqualnames {
    private static final String NAME = "La Hong Vi";
    @Test
    public void TestSingleton(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person personSingleton  = (Person) context.getBean("personsingleton");
        Person personSingletonB = (Person) context.getBean("personsingleton");

    }
}
