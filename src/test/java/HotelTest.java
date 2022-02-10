import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.ConferenceRoom;
import room.RoomType;
import guest.Guest;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceroom;
    private Guest guest;

    @Before
    public void before(){
        hotel = new Hotel ();
        bedroom = new Bedroom (2, null, 101, RoomType.DOUBLE);
        conferenceroom = new ConferenceRoom(10, null, "ConferenceRoomB");
        guest = new Guest ("John");
    }

    @Test
    public void canBedroomStartEmpty(){
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void canConferenceRoomsStartEmpty(){
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canCheckInGuest(){
        assertEquals(1, hotel.checkInGuest(bedroom, guest));
    }





    //bedroom start empty
    //addGuest
    //checkInGuest
    //checkOutGuest
    //conferenceRoomStartEmpty
    //add
}
