package room;

import guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom (Integer capacity, ArrayList<Guest> guests, Integer roomNumber, RoomType roomType){
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void addGuestToRoom(Guest guest) {
        this.guests.add(guest);

    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }
}

