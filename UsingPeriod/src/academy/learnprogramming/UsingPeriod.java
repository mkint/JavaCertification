package academy.learnprogramming;

import java.time.*;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);

//        start.toEpochDay(); // number of days since January 1 1970

        cleanAnimalCage(start, end);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
//        System.out.println(LocalTime.now().plus(period)); // compiles, but throws exception since it's unsupported unit day

//        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
//        System.out.println(yearAndMonth); // returns P1M, why? Those are static methods so they cannot be chained. it'll just see .ofMonths
        // instead we have to do this
        Period yearAndMonth = Period.of(1, 1, 0);
        System.out.println(yearAndMonth); // P1Y1M
        yearAndMonth = Period.of(2,1,0);
        System.out.println(yearAndMonth);

        cleanAnimalCage(start, end, period); // 1 week
        cleanAnimalCage(start, end, Period.ofMonths(1));
        cleanAnimalCage(start, end, Period.ofMonths(2));
        cleanAnimalCage(start, end, Period.ofDays(25));

    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        // using period will allow us to enter either days, weeks, month, etc
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plus(period); // increasing by period rather than month in below method
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); // adding 1 month
        }
    }
}
