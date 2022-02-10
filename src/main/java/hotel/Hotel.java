package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import java.util.ArrayList;
import booking.Booking;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guests;
    private Booking booking;

    public Hotel() {
//        super(name);
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferenceRooms.add(conferenceroom);
    }

    public int checkInGuest(Bedroom bedroom, Guest guest) {
        bedroom.addGuestToRoom(guest);
        this.bedrooms.add(bedroom);
        return this.bedrooms.size();

    }

    public int checkOutGuest(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
        this.bedrooms.remove(bedroom);
        return this.bedrooms.size();
    }

}