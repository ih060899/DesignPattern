package com.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
        System.out.println(phone);
    }
}
