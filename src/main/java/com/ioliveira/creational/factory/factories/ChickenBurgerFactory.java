package com.ioliveira.creational.factory.factories;

import com.ioliveira.creational.factory.product.Burger;
import com.ioliveira.creational.factory.product.ChickenBurger;

public class ChickenBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
