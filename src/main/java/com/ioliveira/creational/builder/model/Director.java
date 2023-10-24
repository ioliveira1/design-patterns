package com.ioliveira.creational.builder.model;

public class Director {
    public void buildFerrari(final Builder builder) {
        builder
                .brand("Ferrari")
                .color("Red");
    }
}
