import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;


public class BedroomTest {

    room.Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, null, 100, RoomType.SINGLE);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(100, bedroom.getRoomNumber());
    }

    @Test
    public void canGetBedroomCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }


    //roomnumber
    ///canGetRoomType
    //canGetRoomCapacity
    //
}
