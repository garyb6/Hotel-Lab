package booking;

import guest.Guest;
import room.Bedroom;
import room.RoomType;

import java.util.ArrayList;

public class Booking extends Bedroom {

    private int nightsBooked;

    public Booking(Integer capacity, ArrayList<Guest> guests, Integer roomNumber, RoomType roomType, int nightsBooked) {
        super(capacity, guests, roomNumber, roomType);
        this.nightsBooked = nightsBooked;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }


}
