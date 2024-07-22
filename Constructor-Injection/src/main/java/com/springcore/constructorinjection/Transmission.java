package com.springcore.constructorinjection;

public class Transmission {
    private String action;

    public Transmission(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
