import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.collegeapp.Calendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    private Calendar calendar;

    @BeforeEach
    public void setUp() {
        calendar = new Calendar();
    }

    @Test
    public void testInitialMonth() {
        assertEquals("January", calendar.getCurrentMonth());
    }

    @Test
    public void testMonthScrollingForward() {
        calendar.scrollMonthForward();
        assertEquals("February", calendar.getCurrentMonth());

        calendar.scrollMonthForward();
        assertEquals("March", calendar.getCurrentMonth());
    }

    @Test
    public void testMonthScrollingBackward() {
        calendar.scrollMonthBackward();
        assertEquals("December", calendar.getCurrentMonth());

        calendar.scrollMonthBackward();
        assertEquals("November", calendar.getCurrentMonth());
    }

    @Test
    public void testMonthScrollingWrapAround() {
        for (int i = 0; i < 12; i++) {
            calendar.scrollMonthForward();
        }
        assertEquals("January", calendar.getCurrentMonth());

        for (int i = 0; i < 13; i++) {
            calendar.scrollMonthBackward();
        }
        assertEquals("December", calendar.getCurrentMonth());
    }
}
