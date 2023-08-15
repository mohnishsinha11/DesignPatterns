/*
 Example of Factory Design Pattern
 */

package org.pattern.creational.Factory.Main;

import org.pattern.creational.Factory.phone.OS;
import org.pattern.creational.Factory.phone.OSFactory;
import org.pattern.creational.Factory.phone.Windows;

public class FactoryMain {
    public static void main(String[] args) {
        OS obj = new Windows();   // not using Factory Design pattern hence we need to change the main method we want another OS
        obj.spec();

        OSFactory osFactory = new OSFactory(); // using
        OS os = osFactory.getInstance("closed");
        os.spec();
    }
}