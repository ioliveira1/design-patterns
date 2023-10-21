package com.ioliveira.creational.factory.products;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger...");
        System.out.println("Adding sauce...");
        System.out.println("Calculating price...");
    }
}
