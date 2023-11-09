package com.ioliveira.behavioral.command.commands;

import com.ioliveira.behavioral.command.components.Light;

import java.util.Objects;

public class SwitchLightsCommand implements Command {

    private final Light light;

    public SwitchLightsCommand(final Light light) {
        this.light = Objects.requireNonNull(light);
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
