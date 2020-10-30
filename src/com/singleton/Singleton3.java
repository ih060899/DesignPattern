package com.singleton;

import com.sun.jdi.event.ExceptionEvent;

public class Singleton3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Abc3 obj1 = Abc3.getInstance();
        });
        Thread t2 = new Thread(() -> {
            Abc3 obj2 = Abc3.getInstance();
        });
        t1.start();
        /*try {
            Thread.sleep(10);
        } catch (Exception e) {

        }*/
        t2.start();

    }
}

class Abc3 {
    public static Abc3 obj;

    private Abc3() {
        System.out.println("Intance...");
    }

    public static Abc3 getInstance() {
        if (obj == null) {
            synchronized (Abc3.class) {
                if (obj == null)
                    obj = new Abc3();
            }
        }

        return obj;
    }

}
