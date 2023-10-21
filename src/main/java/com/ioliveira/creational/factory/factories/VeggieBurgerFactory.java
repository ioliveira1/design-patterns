package com.ioliveira.creational.factory.factories;

import com.ioliveira.creational.factory.product.Burger;
import com.ioliveira.creational.factory.product.VeggieBurger;

public class VeggieBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
