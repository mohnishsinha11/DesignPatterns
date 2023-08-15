package org.pattern.behavioral.Strategy.WithStrategy;

import org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern.SportsDriveCapability;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveCapability());
    }
}
