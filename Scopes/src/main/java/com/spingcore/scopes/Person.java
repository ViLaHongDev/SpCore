package com.spingcore.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class Person {
    private String name;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
