package datetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Immutability {

	// Java 8 Date and Time classes are immutable

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2017, 5, 19);
        System.out.println(date);

        date.plus(20, ChronoUnit.DAYS);     //this will NOT affect the value of LocalDate instance
        System.out.println(date);

        date = date.plus(20, ChronoUnit.DAYS);      //this will affect it
        System.out.println(date);
        
    }
}
