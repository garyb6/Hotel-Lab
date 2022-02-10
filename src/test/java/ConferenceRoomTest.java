import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(10, null, "ConferenceRoomA");
    }

    @Test
    public void canGetName(){
        assertEquals("ConferenceRoomA", conferenceroom.getName());
    }
}
