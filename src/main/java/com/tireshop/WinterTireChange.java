package com.tireshop;

public class WinterTireChange extends Service {

    public WinterTireChange(boolean tiresOnRim, boolean storage, boolean yearlyStorage) {
        super("Winter Tire Change", 650, tiresOnRim, storage, yearlyStorage);

    }


    @Override
    public int calculatePrice() {
        // basisprijs + eventuele extra's
        return (int) getBasePrice() + calculateExtras();
    }




}




/*
Extra check if profile of the tire are good (safety)
When necessary, add some studded tires

Can be more expensive / take longer
 */