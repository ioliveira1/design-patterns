package com.ioliveira.behavioral.command.components;

import com.ioliveira.behavioral.command.commands.Command;

public abstract class Component {
    private Command command;

    public void setCommand(final Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
