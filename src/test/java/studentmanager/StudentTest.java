package studentmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testBirthDate() {
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', "1234567890123");
        assertEquals("12-08-1994", Stue.getBirthDate());
    }

}