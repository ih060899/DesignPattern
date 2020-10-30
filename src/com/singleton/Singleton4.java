package com.singleton;

public class Singleton4 {
    public static void main(String[] args) {
        Xyz obj = Xyz.INSTANCE;
        obj.i=56;
        obj.show();
        Xyz obj1 = Xyz.INSTANCE;
        obj1.show();


    }
}

enum Xyz{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}
