package com.ioliveira.creational.abstractfactory.factories;

import com.ioliveira.creational.abstractfactory.products.gpu.Gpu;
import com.ioliveira.creational.abstractfactory.products.monitor.Monitor;

public abstract class Factory {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
