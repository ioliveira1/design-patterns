package com.ioliveira.creational.factory.factories;

import com.ioliveira.creational.factory.products.Burger;
import com.ioliveira.creational.factory.products.ChickenBurger;

public class ChickenBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
