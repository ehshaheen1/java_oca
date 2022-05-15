package datetimeapi;

import java.time.LocalTime;
import java.time.Period;

public class PeriodTime {

	// Period type can not be added to the LocalTime type

    public static void main(String[] args) {

        Period delayTime = Period.ofDays(2);
        LocalTime trainToYuma = LocalTime.of(15, 10);
        trainToYuma = trainToYuma.plus(delayTime);          // compiles, but throws UnsupportedTemporalTypeException at runtime

    }
}
