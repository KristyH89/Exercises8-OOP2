package com.tireshop;

public class MemberBookingProcessor implements BookingProcessor {
    @Override
    public Booking processBooking(BookingRequest request) {

        Service service = request.getService();

        int price = service.calculatePrice();

        //Member discount
        int discount = 100;
        price -= discount;

        return new Booking(service, price, discount);

    }
}
