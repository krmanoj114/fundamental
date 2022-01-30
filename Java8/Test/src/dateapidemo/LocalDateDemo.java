package dateapidemo;

import java.time.*;
import java.util.Collection;
import java.util.Timer;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();

        System.out.println("dateAndTime = " + dateAndTime);
        System.out.println("time = " + time);
        System.out.println("now = " + now);

        int dd = now.getDayOfMonth();
        int mm = now.getMonthValue();
        int yyyy = now.getYear();
        System.out.println(dd+"/"+mm+"/" +yyyy);
        System.out.printf("%d-%d-%d", dd,mm,yyyy);
        Clock clock = Clock.systemUTC();
        System.out.println("clock.instant() = " + clock.instant());
        System.out.println("clock.millis() = " + clock.millis());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeFromClock = zonedDateTime.now(clock);
        //ZonedDateTime zonedDateTimefromZone = ZonedDateTime.now(ZoneId.of("America"));
        //System.out.println("zonedDateTimefromZone = " + zonedDateTimefromZone);
        System.out.println("zonedDateTimeFromClock = " + zonedDateTimeFromClock);
        System.out.println("zonedDateTime = " + zonedDateTime);


    }
}
