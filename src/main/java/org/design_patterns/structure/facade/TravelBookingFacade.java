package org.design_patterns.structure.facade;

public class TravelBookingFacade {

    private final CarRental carRental;
    private final FlightManager flightManager;
    private final HotelReservation hotelReservation;
    private final PaymentProcessor paymentProcessor;

    public TravelBookingFacade() {
        this.carRental = new CarRental();
        this.flightManager = new FlightManager();
        this.hotelReservation = new HotelReservation();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void bookTrip(Trip trip){
        flightManager.bookFlight(trip.getDeparture(),trip.getDestination(),trip.getFlightDate());
        hotelReservation.reserveHotel(trip.getRoomId(),trip.getCheckInDate(),trip.getCheckOutDate());
        carRental.rentalCar(trip.getCarRentalLocation(),trip.getCarRentalStartDate(),trip.getCarRentalEndDate());
        paymentProcessor.paymentProcess(trip.getAmount(),trip.getPaymentMethod());
    }

}
