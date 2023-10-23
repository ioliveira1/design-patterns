package com.ioliveira.behavioral.observer.listeners;

import com.ioliveira.behavioral.observer.events.Event;

public record MobileListener(String username) implements Listener {

    @Override
    public void update(final Event event) {
        System.out.println("Sending mobile app notification to " + username + " concerning " + event);
    }
}
