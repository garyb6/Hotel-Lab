package room.availableroom;

import room.Room;
import guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom (Integer capacity, ArrayList<Guest> guest, String name){
        super(capacity, guest);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
