package org.design_patterns.structure.facade;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Trip trip = new Trip.TripBuilder()
                .setDeparture("Trip departure")
                .setDestination("Trip destination")
                .setFlightDate(LocalDateTime.now().plusDays(2))
                .setRoomId("Room_123")
                .setCheckInDate(LocalDateTime.now().plusDays(3))
                .setCheckOutDate(LocalDateTime.now().plusDays(6))
                .setCarRentalLocation("Car rental location")
                .setCarRentalStartDate(LocalDateTime.now().plusDays(3))
                .setCarRentalEndDate(LocalDateTime.now().plusDays(6))
                .setAmount(123000)
                .setPaymentMethod(PaymentMethodType.VISA)
                .build();

        TravelBookingFacade travelBooking = new TravelBookingFacade();
        travelBooking.bookTrip(trip);
    }
}
