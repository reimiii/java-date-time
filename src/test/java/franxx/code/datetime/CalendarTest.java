package franxx.code.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class CalendarTest {
    @Test
    void create() {
        var calendar = Calendar.getInstance();
        var date = calendar.getTime();

        System.out.println(date);
    }

    @Test
    void modifyCalendar() {
        var calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 100);

        var date = calendar.getTime();

        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    void getCalendar() {
        var calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
    }
}
