package room.availableroom;

import room.Room;
import guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom (Integer capacity, ArrayList<Guest> guest, Integer roomNumber, RoomType roomType){
        super(capacity, guest);
        this.name = name;


    }
}
