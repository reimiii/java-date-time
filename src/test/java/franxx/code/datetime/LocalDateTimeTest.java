package franxx.code.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void create() {
        LocalDateTime localDateTime1 =  LocalDateTime.now();
        LocalDateTime localDateTime2 =  LocalDateTime.of(2004, Month.MARCH, 8, 10, 30, 10, 456000000);
        LocalDateTime localDateTime3 =  LocalDateTime.parse("2004-03-08T10:30:10.456");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void with() {
        LocalDateTime localDateTime1 =  LocalDateTime.now();
        LocalDateTime localDateTime2 =  localDateTime1.withYear(1990).withMonth(2);
        LocalDateTime localDateTime3 =  localDateTime1.withYear(1950).withHour(10);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5).minusHours(5);
        LocalDateTime localDateTime3 = localDateTime1.minusYears(5).plusHours(5);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }


    @Test
    void date() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = localDateTime.toLocalDate();
        System.out.println(date);

        LocalDateTime res1 = date.atTime(LocalTime.now());
        LocalDateTime res3 = date.atTime(LocalTime.parse("08:08:00"));
        LocalDateTime res2 = date.atTime(10,10,10, 111964767);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    @Test
    void time() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime time = localDateTime.toLocalTime();
        System.out.println(time);

        LocalDateTime res1 = time.atDate(LocalDate.now());
        LocalDateTime res2 = time.atDate(LocalDate.parse("1990-03-08"));

        System.out.println(res1);
        System.out.println(res2);
    }
}
