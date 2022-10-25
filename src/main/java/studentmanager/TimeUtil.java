package studentmanager;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    LocalDate today = LocalDate.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public LocalDate retrieveDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate, formatter);
        return date;
    }

    public boolean checkDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate, formatter);
        if (date.isAfter(LocalDate.of(1900, Month.JANUARY, 1)) && date.isBefore(LocalDate.now().minusYears(18))) {
            return true;
        } else {
            throw new IllegalArgumentException("Please check the input Birth Date. It can't be older than 01-01-1990 and younger than 18 years from now.");
        }
    }

    public int calculateAge(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate, formatter);
        return Period.between(date, today).getYears();
    }

}
