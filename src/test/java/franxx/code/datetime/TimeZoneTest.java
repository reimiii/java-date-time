package franxx.code.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void create() {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);

        var gmt = TimeZone.getTimeZone("GMT");
        System.out.println(gmt);

        var avTime = TimeZone.getAvailableIDs();
        Arrays.asList(avTime).forEach(time -> System.out.println(time));
    }

    @Test
    void date() {
        var date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

    @Test
    void calendar() {
        var jakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        var gmt = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(jakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println(gmt.get(Calendar.HOUR_OF_DAY));

        jakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(jakarta.get(Calendar.HOUR_OF_DAY));
    }
}
