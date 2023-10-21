package com.ioliveira.creational.factory.factories;

import com.ioliveira.creational.factory.products.Burger;

public abstract class BurgerFactory {

    public Burger orderBurger() {
        final Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
