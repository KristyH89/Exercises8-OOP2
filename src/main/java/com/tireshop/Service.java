package com.tireshop;

public abstract class Service {

    private static int counter = 0;
    private final String id;
    private final String name;
    private double basePrice;


    public Service(String name, double basePrice) {
        counter++;
        this.id = "S-" + String.format("%05d", counter);
        this.name = name;
        this.basePrice = basePrice;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public abstract double calculatePrice();
}
