package com.tireshop;

public class WinterTireChange extends Service {

    private boolean tiresOnRim;
    private boolean storage;
    private boolean yearlyStorage;

    public WinterTireChange(boolean tiresOnRim, boolean storage, boolean yearlyStorage) {
        super("Winter Tire Change", 650);
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




/*
Extra check if profile of the tire are good (safety)
When necessary, add some studded tires

Can be more expensive / take longer
 */