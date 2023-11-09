package com.ioliveira.behavioral.command.components;

public class Light {
    private boolean switchedOn = false;

    public void switchLight() {
        System.out.println("Switching light...");

        switchedOn = !switchedOn;

        final String onOff = isSwitchedOn() ? "on" : "off";
        System.out.println("Light is " + onOff);
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }
}
