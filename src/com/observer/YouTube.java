package com.observer;

public class YouTube {
    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber subscriber = new Subscriber("Hridoy");
        Subscriber subscriber1 = new Subscriber("Mahim");
        Subscriber subscriber2 = new Subscriber("Tanvir");
        Subscriber subscriber3 = new Subscriber("Shafin");
        Subscriber subscriber4 = new Subscriber("Rahim");

        telusko.subscribe(subscriber);
        telusko.subscribe(subscriber1);
        telusko.subscribe(subscriber2);
        telusko.subscribe(subscriber3);
        telusko.subscribe(subscriber4);

        telusko.unsubscribe(subscriber);

        subscriber.subscribeChannel(telusko);
        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);

        telusko.upload("How to Learn Programming???");

    }
}
