package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");
        // we just converted strings into time objects

        System.out.println(date); // 2010-02-15 (not formatted because .toString() doesn't format so we can format below
        System.out.println(time); // 11:33 - format options same as above

        String text = date.format(formatter);
        System.out.println(text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);

        // exam tricks
        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
        String dateString = formatter.format(myDate);
        System.out.println(dateString); // 05 05 2010

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(5); // does nothing, no assignment
        System.out.println(formatter.format(anotherDate)); // 05 05 2010, otherwise if we assign the above variable it'll be 10 10 2010


    }
}
