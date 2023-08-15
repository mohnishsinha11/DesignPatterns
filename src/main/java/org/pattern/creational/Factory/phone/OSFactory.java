package org.pattern.creational.Factory.phone;

public class OSFactory {
    public OS getInstance(String str){
        if(str.equals("open"))
            return new Android();
        else if(str.equals("closed"))
            return new IOS();
        return new Windows();
    }
}
