package org.pattern.behavioral.Strategy.WithStrategy;

import org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern.NormalDriveCapability;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveCapability());
    }
}
