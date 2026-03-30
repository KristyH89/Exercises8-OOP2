package com.tireshop;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {

        Service service = request.getService();

        int price = service.calculatePrice();

        // no discount


        return new Booking(service, price, 0);
    }
}
