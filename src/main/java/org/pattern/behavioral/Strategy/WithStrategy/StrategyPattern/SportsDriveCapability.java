package org.pattern.behavioral.Strategy.WithStrategy.StrategyPattern;

public class SportsDriveCapability implements DriveCapability{

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
