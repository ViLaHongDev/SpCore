package com.springcore.setterbaserddi;

public class Vinaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vinaphone Calling");
    }

    @Override
    public void data() {
        System.out.println("Vinaphone Data");
    }
}
