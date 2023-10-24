package com.ioliveira.creational.builder.model;

public class CarBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String color;

    @Override
    public CarBuilder id(final int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(final String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(final String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(final String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(this.id, this.brand, this.model, this.color);
    }
}
