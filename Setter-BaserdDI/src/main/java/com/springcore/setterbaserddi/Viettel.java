package com.springcore.setterbaserddi;

public class Viettel implements Sim{
    @Override
    public void calling() {
        System.out.println("Viettel Calling");
    }

    @Override
    public void data() {
        System.out.println("Viettel Data");
    }
}
