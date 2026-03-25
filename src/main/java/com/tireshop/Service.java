package com.tireshop;

public abstract class Service {

    private static int counter = 0;
    private final String id;
    private final String name;
    private double basePrice;

    // extra options for services:

    protected final boolean tiresOnRim;
    protected final boolean storage;
    protected final boolean yearlyStorage;

    public Service(String name, double basePrice, boolean tiresOnRim, boolean storage, boolean yearlyStorage) {
        counter++;
        this.id = "S-" + String.format("%05d", counter);
        this.name = name;
        this.basePrice = basePrice;

        this.tiresOnRim = tiresOnRim;
        this.storage = storage;
        this.yearlyStorage = yearlyStorage;

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
// Extra cost for tires on rim and storage.

    protected int calculateExtras() {
        int total = 0;

        if (!tiresOnRim) {
            total += 500;
        }
        if (storage) {
            total += yearlyStorage ? 1000 : 600;
        }
        return total;
    }

    public String getPriceBreakdown() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName())
                .append(" - Base price: ")
                .append((int) getBasePrice())
                .append(" SEK\n");

        if (!tiresOnRim) sb.append("Extra work (tires not on rim): +500 SEK\n");
        if (storage) sb.append("Storage: +")
                .append(yearlyStorage ? "1000" : "600")
                .append(" SEK\n");

        return sb.toString();
    }

    public abstract int calculatePrice();

}