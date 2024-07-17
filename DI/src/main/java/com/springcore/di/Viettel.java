package com.springcore.di;

public class Viettel implements Sim{
    @Override
    public void calling() {
        System.out.println("Viettel calling");
    }

    @Override
    public void data() {
        System.out.println("Viettel data");
    }
}
