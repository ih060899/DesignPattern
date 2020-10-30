package com.factory.Phone;

public class OperatingSystemFactory {
    public Os getInstance(String str){
        if (str.equals("Open"))
            return new Android();
        else if (str.equals("Closed"))
            return new IOS();
        else
            return new Windows();

    }
}
