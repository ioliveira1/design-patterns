package com.ioliveira.behavioral.observer.listeners;

import com.ioliveira.behavioral.observer.events.Event;

public interface Listener {
    void update(final Event event);
}
