package studentmanager;

import java.time.LocalDate;

public class Student {

    TimeUtil util = new TimeUtil();

    private String firstName;

    private String lastName;

    private String birthDate;

    private char gender;

    private String ID;

    public Student(String firstName, String lastName, String birthDate, char gender, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                '}';
    }

    public LocalDate getParsedBirthDate() {
        return util.retrieveDate(birthDate);
    }

    public String getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

}
