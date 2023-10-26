package com.ioliveira.creational.prototype;

public class Car extends Vehicle implements Cloneable{
    private int topSpeed;
    private GpsSystem gpsSystem;

    public Car(final String brand, final String model, final String color, final int topSpeed, final GpsSystem gpsSystem) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
        this.gpsSystem = gpsSystem;
    }

    @Override
    public Car clone() {
        try {
            final Car clone = (Car) super.clone();
            //Deep Copy - Sem a linha abaixo, o objeto gpsSystem seria o mesmo para todos os objetos.
            //Dessa forma, cria-se uma cópia do atributo gpsSystem para o clone.
            //Assim, uma alteração no atributo gpsSystem não afetará o objeto clonado.
            clone.setGpsSystem(this.gpsSystem.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(final int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public GpsSystem getGpsSystem() {
        return gpsSystem;
    }

    public void setGpsSystem(final GpsSystem gpsSystem) {
        this.gpsSystem = gpsSystem;
    }
}
