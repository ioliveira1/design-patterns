package com.ioliveira.behavioral.observer;

import com.ioliveira.behavioral.observer.events.Event;
import com.ioliveira.behavioral.observer.listeners.EmailListener;
import com.ioliveira.behavioral.observer.listeners.MobileListener;
import com.ioliveira.behavioral.observer.store.Store;

public class Main {
    public static void main(String[] args) {

        final Store store = new Store();
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailListener("igorfoliveira@gmail.com"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailListener("igorfoliveira2@gmail.com"));

        store.getNotificationService().subscribe(Event.SALE, new MobileListener("username1"));
        store.getNotificationService().subscribe(Event.SALE, new MobileListener("username2"));

        store.newItens();
        store.salesPromotion();

        store.getNotificationService().unsubscribe(Event.NEW_ITEM, new EmailListener("igorfoliveira2@gmail.com"));
        store.getNotificationService().unsubscribe(Event.SALE, new MobileListener("username2"));

        System.out.println("After unsubscribe");

        store.newItens();
        store.salesPromotion();

    }
}
