package studentmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHandlerTest {

    @Test
    void testAddStudentWithValidAge() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', "1234567890123");
        assertEquals("Hervis", testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithInvalidAge() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1889",'M', "1234567890123");
        Assertions.assertThrows(IllegalArgumentException.class, () -> testManager.addStudent(Stue), ("Please check the input Birth Date. It can't be older than 01-01-1990 and younger than 18 years from now."));
    }

    @Test
    void testAddStudentWithValidID() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', "1234567890123");
        assertEquals("1234567890123", testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithInvalidID() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', null);
        assertThrows(IllegalArgumentException.class, () -> testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithValidFirstName() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', "1234567890123");
        assertEquals("Chavis", testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithMissingFirstName() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("", "Hervis", "12-08-1994",'M', "1234567890123");
        assertThrows(IllegalArgumentException.class, () -> testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithValidLastName() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "Hervis", "12-08-1994",'M', "1234567890123");
        assertEquals("Hervis", testManager.addStudent(Stue));
    }

    @Test
    void testAddStudentWithMissingLastName() {
        StudentHandler testManager = new StudentHandler();
        Student Stue = new Student("Chavis", "", "12-08-1994",'M', "1234567890123");
        assertThrows(IllegalArgumentException.class, () -> testManager.addStudent(Stue));
    }

}