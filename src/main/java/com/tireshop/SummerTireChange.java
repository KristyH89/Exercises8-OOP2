package com.tireshop;

public class SummerTireChange extends Service {

    public SummerTireChange(boolean tiresOnRim, boolean storage, boolean yearlyStorage) {
        super("Summer Tire Change", 500, tiresOnRim, storage, yearlyStorage);
    }

    @Override
    public int calculatePrice() {
        int total = (int) getBasePrice() + calculateExtras();
        return total - 50; // apply summer discount
    }
    @Override
    public String getPriceBreakdown() {
        StringBuilder sb = new StringBuilder();

        // Reuse the base breakdown from the Service class (base price + extras)
        sb.append(super.getPriceBreakdown());

        // Calculate subtotal before applying any discount
        int subtotal = (int) getBasePrice() + calculateExtras();

        // Define summer discount
        int discount = 50;

        // Add discount information to the breakdown
        sb.append("Summer discount: -")
                .append(discount)
                .append(" SEK\n");

        // Show subtotal before discount for clarity
        sb.append("Subtotal before discount: ")
                .append(subtotal)
                .append(" SEK\n");

        return sb.toString();
    }
}