package com.observer;

public interface Subject {
    String getTitle();

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();

    void upload(String title);
}
