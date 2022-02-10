import booking.Booking;
import org.junit.Before;
import org.junit.Test;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;

    @Before
    public void before(){
        booking = new Booking(2, null,666, RoomType.DOUBLE, 7 );
    }

    @Test
    public void canMakeBooking(){
        assertEquals(7, booking.getNightsBooked());
    }

}
