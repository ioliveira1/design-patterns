package com.ioliveira.creational.factory;

import com.ioliveira.creational.factory.factories.BurgerFactory;
import com.ioliveira.creational.factory.factories.ChickenBurgerFactory;
import com.ioliveira.creational.factory.factories.VeggieBurgerFactory;

public class Main {
    public static void main(String[] args) {

        final BurgerFactory chickenBurgerFactory = new ChickenBurgerFactory();
        chickenBurgerFactory.orderBurger();

        final BurgerFactory veggieBurgerFactory = new VeggieBurgerFactory();
        veggieBurgerFactory.orderBurger();

    }
}
