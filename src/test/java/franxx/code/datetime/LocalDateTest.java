package franxx.code.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void create() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1990, Month.JANUARY, 10);
        LocalDate date3 = LocalDate.parse("1990-01-10");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

    @Test
    void with() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.withYear(1990);
        LocalDate date3 = date1.withYear(1990).withMonth(1);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

    @Test
    void modify() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusYears(10);
        LocalDate date3 = date1.minusMonths(10);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

    @Test
    void get() {
        LocalDate date1 = LocalDate.now();

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
    }
}
