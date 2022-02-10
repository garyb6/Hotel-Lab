package room.availableroom;

import room.Room;
import guest.Guest;
import java.util.ArrayList;

public class Bedroom extends Room {

    private Integer roomNumber;
    private RoomType roomType;

    public Bedroom (Integer capacity, ArrayList<Guest> guest, Integer roomNumber, RoomType roomType){
        super(capacity, guest);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
