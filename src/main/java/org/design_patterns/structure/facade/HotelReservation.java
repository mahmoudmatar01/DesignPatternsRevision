package org.design_patterns.structure.facade;

import java.time.LocalDateTime;

public class HotelReservation {

    public void reserveHotel(String roomId, LocalDateTime checkinDate, LocalDateTime checkOutDate){
        System.out.println("Room hotel reservation started");
        System.out.println("Reserve a room with id "+roomId+" and the check in date "+checkinDate+" and check out date "+checkOutDate);
    }

}
