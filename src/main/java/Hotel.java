import guest.Guest;
import room.availableroom.Bedroom;
import room.availableroom.ConferenceRoom;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest;

    public Hotel (ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, Guest guest){
        this.guest = guest;
    }


}
