// Exmaple of builder design patter
package org.pattern.creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        /*
            In below statement while creating Phone object we are not using builder design pattern.
            Here, disadvantage of using constructor is that we have to pass every parameter even though it is not used and
            we need to remember the sequence of parameters in constructor
        */
        Phone p1 = new Phone(8,"Android", "Intel", 15.5, 1100);
        System.out.println(p1);

        /*
            Using the builder design pattern
        */
        Phone p2 = new PhoneBuilder()
                .setRam(4)
                .setOperatingSystem("IOS")
                .setScreenSize(15.0)
                .setBattery(1500)
                .setProcessor("AMD").getPhone();

        System.out.println(p2);
    }
}
