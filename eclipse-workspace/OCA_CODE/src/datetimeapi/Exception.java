package datetimeapi;

import java.time.LocalTime;

public class Exception {

	 public static void main(String[] args) {

	        LocalTime time1 = LocalTime.of(15,59);      // valid statement
	        System.out.println(time1);

	        // minutes argument can not be larger than 59
	        LocalTime time2 = LocalTime.of(15,60);      // compiles, but throws a runtime DateTimeException
	        System.out.println(time2);

	    }
}
