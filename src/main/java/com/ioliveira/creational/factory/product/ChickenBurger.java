package com.ioliveira.creational.factory.product;

public class ChickenBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger...");
        System.out.println("Adding sauce...");
        System.out.println("Calculating price...");
    }
}
