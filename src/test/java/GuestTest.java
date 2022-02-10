import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Bugs Bunny");
    }

    @Test
    public void canGetName(){
        assertEquals("Bugs Bunny", guest.getName());
    }
}
