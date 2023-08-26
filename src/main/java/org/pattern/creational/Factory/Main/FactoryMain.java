/*
 Example of Factory Design Pattern

 If we are creating object on conditional basis then we are using factory pattern.
 */

package org.pattern.creational.Factory.Main;

import org.pattern.creational.Factory.phone.OS;
import org.pattern.creational.Factory.phone.OSFactory;
import org.pattern.creational.Factory.phone.Windows;

public class FactoryMain {
    public static void main(String[] args) {
        // not using Factory Design pattern hence we need to change the main method if we want another OS
        OS obj = new Windows();
        obj.spec();

        //using factory pattern
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("closed");
        os.spec();
    }
}