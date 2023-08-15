package org.pattern.behavioral.Strategy.WithoutStrategy;

public class WithoutStrategyDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
