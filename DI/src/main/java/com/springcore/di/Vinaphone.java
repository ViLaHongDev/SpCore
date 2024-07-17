package com.springcore.di;

public class Vinaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vinaphone calling");
    }

    @Override
    public void data() {
        System.out.println("Vinaphone data");
    }
}
