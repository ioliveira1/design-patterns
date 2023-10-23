package com.ioliveira.behavioral.observer.listeners;

import com.ioliveira.behavioral.observer.events.Event;

public record EmailListener(String email) implements Listener {

    @Override
    public void update(final Event event) {
        System.out.println("Sending email notification to " + email() + " concerning " + event);
    }
}
