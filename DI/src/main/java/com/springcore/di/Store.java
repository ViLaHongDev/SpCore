package com.springcore.di;

public class Store {
    private Sim sim;
    public Store(Sim sim){
        this.sim = sim;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }
}
