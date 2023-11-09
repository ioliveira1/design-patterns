package com.ioliveira.behavioral.command;

import com.ioliveira.behavioral.command.commands.OpenCloseCurtainCommand;
import com.ioliveira.behavioral.command.commands.SwitchLightsCommand;
import com.ioliveira.behavioral.command.components.Curtain;
import com.ioliveira.behavioral.command.components.Light;
import com.ioliveira.behavioral.command.components.Room;

public class Main {
    public static void main(String[] args) {

        final Room room = new Room();

        room.setCommand(new OpenCloseCurtainCommand(new Curtain()));
        room.executeCommand();
        System.out.println("+++++++++++++++++++");
        room.executeCommand();

        System.out.println("==================================================");

        room.setCommand(new SwitchLightsCommand(new Light()));
        room.executeCommand();
        System.out.println("+++++++++++++++++++");
        room.executeCommand();

    }
}
