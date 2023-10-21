package com.ioliveira.creational.abstractfactory;

import com.ioliveira.creational.abstractfactory.factories.AsusFactory;
import com.ioliveira.creational.abstractfactory.factories.Factory;
import com.ioliveira.creational.abstractfactory.factories.MsiFactory;

public class Main {
    public static void main(String[] args) {

        final Factory msi = new MsiFactory();
        final Factory asus = new AsusFactory();

        msi.createGpu().assemble();
        msi.createMonitor().assemble();

        asus.createGpu().assemble();
        asus.createMonitor().assemble();
    }
}
