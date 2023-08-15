package org.pattern.behavioral.Strategy.WithStrategy;

import org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern.SportsDriveCapability;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveCapability());
    }
}
