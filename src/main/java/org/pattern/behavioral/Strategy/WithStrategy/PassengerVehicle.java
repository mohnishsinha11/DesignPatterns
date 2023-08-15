package org.pattern.behavioral.Strategy.WithStrategy;

import org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern.NormalDriveCapability;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveCapability());
    }
}
