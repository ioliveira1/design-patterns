package com.ioliveira.creational.abstractfactory.products.monitor;

public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor...");
    }
}