package com.ioliveira.behavioral.observer.services;

import com.ioliveira.behavioral.observer.events.Event;
import com.ioliveira.behavioral.observer.listeners.Listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<Event, List<Listener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        Arrays.stream(Event.values())
                .forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(final Event event, final Listener listener) {
        customers.get(event).add(listener);
    }

    public void unsubscribe(final Event event, final Listener listener) {
        customers.get(event).remove(listener);
    }

    public void notifyCustomers(final Event event) {
        customers.get(event).forEach(listener -> listener.update(event));
    }
}
