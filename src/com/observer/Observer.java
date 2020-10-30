package com.observer;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
