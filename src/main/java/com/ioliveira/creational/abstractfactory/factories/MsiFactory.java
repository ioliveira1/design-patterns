package com.ioliveira.creational.abstractfactory.factories;

import com.ioliveira.creational.abstractfactory.products.gpu.Gpu;
import com.ioliveira.creational.abstractfactory.products.gpu.MsiGpu;
import com.ioliveira.creational.abstractfactory.products.monitor.Monitor;
import com.ioliveira.creational.abstractfactory.products.monitor.MsiMonitor;

public class MsiFactory extends Factory {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
