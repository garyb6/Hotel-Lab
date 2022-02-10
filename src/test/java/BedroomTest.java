import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;


public class BedroomTest {

    room.Bedroom bedroom;
    guest.Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, null, 100, RoomType.SINGLE);
        guest = new Guest("John");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(100, bedroom.getRoomNumber());
    }

    @Test
    public void canGetBedroomCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void canCountGuests(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void addGuestToRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.countGuests());
    }



//    @Test
//    public void canAddGuestToRoom(){
//        assertEquals( bedroom.addGuestToRoom());
//    }

}
