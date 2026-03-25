package com.tireshop;

public class SummerTireChange extends Service {

    private boolean tiresOnRim;
    private boolean storage;
    private boolean yearlyStorage;

    public SummerTireChange(boolean tiresOnRim, boolean storage, boolean yearlyStorage) {
        super("Summer Tire Change", 500);
        this.tiresOnRim = tiresOnRim;
        this.storage = storage;
        this.yearlyStorage = yearlyStorage;
    }

    @Override
    public double calculatePrice() {
        double total = getBasePrice();

        if (!tiresOnRim) {
            total += 500;
        }
        if (storage) {
            if (yearlyStorage) {
                total += 1000;
            } else {
                total += 600;
            }
        }

        return total;

    }
}