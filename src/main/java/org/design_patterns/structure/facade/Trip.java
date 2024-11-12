package org.design_patterns.structure.facade;

import java.time.LocalDateTime;

public class Trip {

    private final String departure;
    private final String destination;
    private final LocalDateTime flightDate;
    private final String roomId;
    private final LocalDateTime checkInDate;
    private final LocalDateTime checkOutDate;
    private final String carRentalLocation;
    private final LocalDateTime carRentalStartDate;
    private final LocalDateTime carRentalEndDate;
    private final double amount;
    private final PaymentMethodType paymentMethod;

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    public String getRoomId() {
        return roomId;
    }

    public LocalDateTime getCheckInDate() {
        return checkInDate;
    }

    public LocalDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public String getCarRentalLocation() {
        return carRentalLocation;
    }

    public LocalDateTime getCarRentalStartDate() {
        return carRentalStartDate;
    }

    public LocalDateTime getCarRentalEndDate() {
        return carRentalEndDate;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    private Trip(TripBuilder builder) {
        this.departure = builder.getDeparture();
        this.destination = builder.getDestination();
        this.flightDate = builder.getFlightDate();
        this.roomId = builder.getRoomId();
        this.checkInDate = builder.getCheckInDate();
        this.checkOutDate = builder.getCheckOutDate();
        this.carRentalLocation = builder.getCarRentalLocation();
        this.carRentalStartDate = builder.getCarRentalStartDate();
        this.carRentalEndDate = builder.getCarRentalEndDate();
        this.amount = builder.getAmount();
        this.paymentMethod = builder.getPaymentMethod();
    }

    // builder class
    public static class TripBuilder {
        private String departure;
        private String destination;
        private LocalDateTime flightDate;
        private String roomId;
        private LocalDateTime checkInDate;
        private LocalDateTime checkOutDate;
        private String carRentalLocation;
        private LocalDateTime carRentalStartDate;
        private LocalDateTime carRentalEndDate;
        private double amount;
        private PaymentMethodType paymentMethod;

        // getter and setter method
        public String getDeparture() {
            return departure;
        }

        public TripBuilder setDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public String getDestination() {
            return destination;
        }

        public TripBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public LocalDateTime getFlightDate() {
            return flightDate;
        }

        public TripBuilder setFlightDate(LocalDateTime flightDate) {
            this.flightDate = flightDate;
            return this;
        }

        public String getRoomId() {
            return roomId;
        }

        public TripBuilder setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public LocalDateTime getCheckInDate() {
            return checkInDate;
        }

        public TripBuilder setCheckInDate(LocalDateTime checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        public LocalDateTime getCheckOutDate() {
            return checkOutDate;
        }

        public TripBuilder setCheckOutDate(LocalDateTime checkOutDate) {
            this.checkOutDate = checkOutDate;
            return this;
        }

        public String getCarRentalLocation() {
            return carRentalLocation;
        }

        public TripBuilder setCarRentalLocation(String carRentalLocation) {
            this.carRentalLocation = carRentalLocation;
            return this;
        }

        public LocalDateTime getCarRentalStartDate() {
            return carRentalStartDate;
        }

        public TripBuilder setCarRentalStartDate(LocalDateTime carRentalStartDate) {
            this.carRentalStartDate = carRentalStartDate;
            return this;
        }

        public LocalDateTime getCarRentalEndDate() {
            return carRentalEndDate;
        }

        public TripBuilder setCarRentalEndDate(LocalDateTime carRentalEndDate) {
            this.carRentalEndDate = carRentalEndDate;
            return this;
        }

        public double getAmount() {
            return amount;
        }

        public TripBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public PaymentMethodType getPaymentMethod() {
            return paymentMethod;
        }

        public TripBuilder setPaymentMethod(PaymentMethodType paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Trip build(){
            return new Trip(this);
        }

    }
}
