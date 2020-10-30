package com.factory;

import com.factory.Phone.OperatingSystemFactory;
import com.factory.Phone.Os;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        Os obj = osf.getInstance("Closed");
        obj.spec();


    }
}
