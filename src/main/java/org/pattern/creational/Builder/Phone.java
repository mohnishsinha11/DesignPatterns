package org.pattern.creational.Builder;

public class Phone {
    private int ram;
    private String operatingSystem;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(int ram, String operatingSystem, String processor, double screenSize, int battery) {
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
