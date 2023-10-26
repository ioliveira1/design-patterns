package com.ioliveira.creational.prototype;

public class Main {
    public static void main(String[] args) {
        final GpsSystem gpsSystem1 = new GpsSystem("GPS Name 1", "GPS Model 1");
        final Car car = new Car("Brand 1", "Model 1", "Color 1", 1, gpsSystem1);

        final Car clone = car.clone();

        gpsSystem1.setName("Name 2");
        gpsSystem1.setModel("Model 2");
    }
}
