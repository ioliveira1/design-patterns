package com.ioliveira.creational.prototype;

public class GpsSystem implements Cloneable {
    private String name;
    private String model;

    public GpsSystem(final String name, final String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    @Override
    public GpsSystem clone() {
        try {
            return (GpsSystem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
