package org.pattern.behavioral.Strategy.WithStrategy;

import org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern.DriveCapability;

public class Vehicle {
    DriveCapability driveCapability;

    public Vehicle(DriveCapability driveCapability) {
        this.driveCapability = driveCapability;
    }

    public void drive(){
        driveCapability.drive();
    }
}
