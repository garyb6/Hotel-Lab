package room;

import guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom (Integer capacity, ArrayList<Guest> guest, Integer roomNumber, RoomType roomType){
        super(capacity, guest);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
