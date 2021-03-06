package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConstructorDateTimeApi {

	public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(LocalDate.of(1993,5, 19), LocalTime.of(23, 58));

        ldt = ldt.withDayOfYear(40);
        System.out.println(ldt);

        System.out.println("month: " + ldt.getMonth());
        System.out.println("day in month: " + ldt.getDayOfMonth());
        System.out.println("hour: " + ldt.getHour());

    }

}
