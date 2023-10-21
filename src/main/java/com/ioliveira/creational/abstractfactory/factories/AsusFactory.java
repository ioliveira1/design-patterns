package com.ioliveira.creational.abstractfactory.factories;

import com.ioliveira.creational.abstractfactory.products.gpu.AsusGpu;
import com.ioliveira.creational.abstractfactory.products.gpu.Gpu;
import com.ioliveira.creational.abstractfactory.products.monitor.AsusMonitor;
import com.ioliveira.creational.abstractfactory.products.monitor.Monitor;

public class AsusFactory extends Factory {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
