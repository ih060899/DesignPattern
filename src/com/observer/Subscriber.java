package com.observer;

public class Subscriber implements Observer {
    private String subscriberName;
    private Channel channel = new Channel();

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update() {
        System.out.println("hey " + subscriberName + ", Video Uploaded..." + channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
