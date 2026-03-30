package com.tireshop;

public class Booking {

    private Service service;
    private int finalPrice;
    private int discount;

    public Booking(Service service, int finalPrice, int discount) {
        this.service = service;
        this.finalPrice = finalPrice;
        this.discount = discount;
    }

    public void printSummary() {
        System.out.println(service.getId() + " - " + service.getName());
        System.out.println(service.getPriceBreakdown());

        if (discount > 0) {
            System.out.println("Member discount: -" + discount + " SEK");
        }
        System.out.println("Final price: " + finalPrice + " SEK");

    }
}
