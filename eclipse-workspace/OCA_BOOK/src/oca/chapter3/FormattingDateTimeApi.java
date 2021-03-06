package oca.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTimeApi {

	public static void main(String[] args) {
		//Default formatter
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		//Localized formatter
		
		DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
				System.out.println(shortDateTime.format(dateTime)); // 1/20/20
				System.out.println(shortDateTime.format(date)); // 1/20/20
				//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
                
				System.out.println("------------------For different types---------------------");
				DateTimeFormatter shortDateTime1 =DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
				System.out.println(shortDateTime1.format(dateTime)); // Jan 20, 2020
				System.out.println(shortDateTime1.format(date)); // Jan 20, 2020
				
				System.out.println("=====================================================");
				DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
				System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
				
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				DateTimeFormatter ff = DateTimeFormatter.ofPattern("hh:mm");
				// ff.format(dateTime);
				 //ff.format(date);
				 
				 System.out.println(ff.format(dateTime));
				 System.out.println(ff.format(time));
				 // We can parse from string to LocalDate/LocalTime/LocalDateTime with formatter or without formatter
				 System.out.println("----------------Parsing--------------");
				 DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
				 LocalDate date1 = LocalDate.parse("2015-01-02");// Java default formatter like this 
				 LocalTime time1 = LocalTime.parse("11:22");
				 System.out.println(date1); // 2015-01-02
				 System.out.println(time1); // 11:22
				 
				 System.out.println("----------------Parsing second part--------------");
				 DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMM dd yyyy");
				 LocalDate date2 = LocalDate.parse("Jan 20 2020",f2);// Java default formatter like this 
				 LocalTime time2 = LocalTime.parse("11:22");
				 System.out.println(date2); // 2015-01-02
				 System.out.println(time2); // 11:22
				 
				 
				 
				 
	}

}
