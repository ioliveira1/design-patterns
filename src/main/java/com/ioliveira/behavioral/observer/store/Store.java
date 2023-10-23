package com.ioliveira.behavioral.observer.store;

import com.ioliveira.behavioral.observer.events.Event;
import com.ioliveira.behavioral.observer.services.NotificationService;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItens() {
        notificationService.notifyCustomers(Event.NEW_ITEM);
    }

    public void salesPromotion() {
        notificationService.notifyCustomers(Event.SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
