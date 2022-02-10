import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest;

    public Hotel (Guest guest){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guest = guest;
    }





}
