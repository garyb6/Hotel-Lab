package room;

import room.Room;
import guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom (Integer capacity, ArrayList<Guest> guests, String name){
        super(capacity, guests);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
