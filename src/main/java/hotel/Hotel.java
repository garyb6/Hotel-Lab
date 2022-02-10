package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import java.util.ArrayList;

public class Hotel{

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guests;

    public Hotel (){
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

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferenceRooms.add(conferenceroom);
    }

    public int checkInGuest(Bedroom bedroom, Guest guest){
        //add guest to bedroom
        //add bedroom to hotel bedrooms list
//        bedrooms..add(guest);
        bedroom.addGuestToRoom(guest);
        this.bedrooms.add(bedroom);
        return this.bedrooms.size();

    }

}
