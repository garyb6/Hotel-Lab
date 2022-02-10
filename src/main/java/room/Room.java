package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuest() {
        return this.guests;
    }

    public void setGuest(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}

