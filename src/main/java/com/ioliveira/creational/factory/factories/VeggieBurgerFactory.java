package com.ioliveira.creational.factory.factories;

import com.ioliveira.creational.factory.products.Burger;
import com.ioliveira.creational.factory.products.VeggieBurger;

public class VeggieBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
