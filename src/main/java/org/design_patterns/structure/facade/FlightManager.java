package org.design_patterns.structure.facade;

import java.time.LocalDateTime;

public class FlightManager {

    public void bookFlight(String departure, String destination, LocalDateTime flightDate){
        System.out.println("Booking flight started");
        System.out.println("Booking flight with departure : "+departure+" and destination : "+destination+" at "+flightDate);
    }

}
