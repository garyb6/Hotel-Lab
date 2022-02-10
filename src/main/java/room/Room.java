package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private Integer capacity;
    private ArrayList<Guest> guest;

    public Room (Integer capacity, ArrayList<Guest> guest) {
        this.capacity = capacity;
        this.guest = guest;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuest() {
        return this.guest;
    }

    public void setGuest(ArrayList<Guest> guest) {
        this.guest = guest;
    }
}

