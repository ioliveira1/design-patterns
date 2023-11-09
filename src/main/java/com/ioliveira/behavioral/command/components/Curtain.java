package com.ioliveira.behavioral.command.components;

public class Curtain {

    private boolean open;

    public void openCloseCurtain() {
        System.out.println("Opening/Closing curtain...");

        open = !open;

        final String onOff = isOpen() ? "opened" : "closed";
        System.out.println("Curtain is " + onOff);
    }

    public boolean isOpen() {
        return open;
    }
}
