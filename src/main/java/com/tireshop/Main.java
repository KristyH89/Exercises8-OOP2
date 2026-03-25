package com.tireshop;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Service winter = new WinterTireChange(false, true, false);
        Service summer = new SummerTireChange(true, false, false);

        System.out.println("=========================== Exercise 1 ==================================");
        System.out.println(winter.getId() + " - " + winter.getName() + " : " + winter.calculatePrice() + " SEK");
        System.out.println(summer.getId() + " - " + summer.getName() + " : " + summer.calculatePrice() + " SEK");
        System.out.println();


        System.out.println("=========================== Exercise 2 ==================================");

        List<Service> services = new ArrayList<>();

        services.add(new WinterTireChange(false, true, false));
        services.add(new SummerTireChange(true, false, false));
        services.add(new WinterTireChange(true, true, true));

        for (Service s : services) {
            System.out.println(s.getId() + " - " + s.getName());
            System.out.println(s.getPriceBreakdown());
            System.out.println("Total price: " + s.calculatePrice() + " SEK\n");

        }


    }
}
