// Strategy design pattern is used when the subclass have redundant code and to remove redundancy we use Strategy Pattern
package org.pattern.behavioral.Strategy.WithStrategy;

public class WithStrategyDemo {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
    }
}
