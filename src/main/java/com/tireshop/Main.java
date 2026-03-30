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

            System.out.println("=========================== Exercise 3 ==================================");
        // Example 1: Member booking (Winter tires)
        Service winterService = new WinterTireChange(false, true, false);
        BookingRequest winterRequest = new BookingRequest(winterService);

        BookingProcessor memberProcessor = new MemberBookingProcessor();
        Booking winterBooking = memberProcessor.processBooking(winterRequest);
        winterBooking.printSummary();

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        //Example 2: Non-member booking (Summer tires)
        Service summerService = new SummerTireChange(true, false, false);
        BookingRequest summerRequest = new BookingRequest(summerService);

        BookingProcessor nonMemberProcessor = new NonMemberBookingProcessor();
        Booking summerBooking = nonMemberProcessor.processBooking(summerRequest);

        summerBooking.printSummary();
        Service service = new WinterTireChange(false, true, false);

        System.out.println();

        System.out.println("Thanks for watching my exercises! Have a nice day =) ");
        }



}
