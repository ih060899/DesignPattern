package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers
        )
            subscriber.update();
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
