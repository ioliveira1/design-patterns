package com.ioliveira.behavioral.command.commands;

import com.ioliveira.behavioral.command.components.Curtain;

import java.util.Objects;

public class OpenCloseCurtainCommand implements Command {

    private final Curtain curtain;

    public OpenCloseCurtainCommand(final Curtain curtain) {
        this.curtain = Objects.requireNonNull(curtain);
    }

    @Override
    public void execute() {
        curtain.openCloseCurtain();
    }
}
