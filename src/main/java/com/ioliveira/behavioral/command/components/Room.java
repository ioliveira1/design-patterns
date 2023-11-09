package com.ioliveira.behavioral.command.components;

public class Room extends Component {

    private final Light light;
    private final Curtain curtain;

    public Room() {
        this.curtain = new Curtain();
        this.light = new Light();
    }

    public Light getLight() {
        return light;
    }

    public boolean isLightOn() {
        return light.isSwitchedOn();
    }

    public Curtain getCurtain() {
        return curtain;
    }

    public boolean isCurtainOpen() {
        return curtain.isOpen();
    }
}
