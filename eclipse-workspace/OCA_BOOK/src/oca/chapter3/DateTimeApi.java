package oca.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeApi {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		// Chaining not a problem on local date time 
		LocalDateTime dateTime = LocalDateTime.of(date, time)
		.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime);
		//Period chain value return the last one 
		Period wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println(wrong);
		Period everyYearAndAWeek = Period.of(0, 0, 0);
		System.out.println(everyYearAndAWeek);
		Period everyYearAndAWeek11 = Period.of(1, 1, 1);
		System.out.println(everyYearAndAWeek11);

	}

}
