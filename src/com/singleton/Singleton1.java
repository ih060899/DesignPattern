package com.singleton;

public class Singleton1 {

    public static void main(String[] args) {
        Abcd2 obj1 = Abcd2.getInstance();
        Abcd2 obj2 = Abcd2.getInstance();
        obj1.setName("Imran");
        System.out.println(obj2.getName());


    }
}


class Abcd2 {
    public static Abcd2 obj;
    private String name;

    private Abcd2() {
//        System.out.println("Instance created..");

    }

    public static Abcd2 getInstance() {
        if (obj == null) {
            obj = new Abcd2();
        }

        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
