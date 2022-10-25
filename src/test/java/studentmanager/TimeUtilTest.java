package studentmanager;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilTest {

    @Test
    void retrieveDate() {
        TimeUtil util = new TimeUtil();
        LocalDate date = LocalDate.parse("12-08-1994", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        assertEquals(date, util.retrieveDate("12-08-1994"));
    }

    @Test
    void testValidDate() {
        TimeUtil util = new TimeUtil();
        assertEquals("12-08-1994", util.checkDate("12-08-1994"));
    }

    @Test
    void testInvalidDate() {
        TimeUtil util = new TimeUtil();
        assertThrows(IllegalArgumentException.class, () -> util.checkDate("12-08-1889"));
    }

    @Test
    void calculateAge() {
        TimeUtil util = new TimeUtil();
        //born on 12.08.1994
        assertEquals(28, util.calculateAge("12-08-1994"));
    }
}