package com.ioliveira.creational.abstractfactory.products.gpu;

public class MsiGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("Assembling Msi Gpu...");
    }
}
