package com.ioliveira.creational.abstractfactory.products.gpu;

public class AsusGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("Assembling Asus Gpu...");
    }
}
