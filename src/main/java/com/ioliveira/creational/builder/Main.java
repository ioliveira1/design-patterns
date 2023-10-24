package com.ioliveira.creational.builder;

import com.ioliveira.creational.builder.model.Car;
import com.ioliveira.creational.builder.model.CarBuilder;
import com.ioliveira.creational.builder.model.Director;

public class Main {
    public static void main(String[] args) {

        final Car car1 = new CarBuilder()
                .id(1234)
                .brand("Ferrari")
                .color("Red")
                .model("F8")
                .build();

        final Director director = new Director();
        final CarBuilder builder = new CarBuilder()
                .id(4567)
                .model("SF90");

        director.buildFerrari(builder);
        final Car car2 = builder.build();

        System.out.println(car1);
        System.out.println(car2);

    }
}
