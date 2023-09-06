package franxx.code.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {
    @Test
    void parsing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 09 06", formatter);
        System.out.println(localDate);
    }

    @Test
    void format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 09 06", formatter);
        String format = localDate.format(formatter);

        System.out.println(format);
    }

    @Test
    void defaultFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 09 06", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);
    }

    @Test
    void i18n() {
        Locale locale = new Locale("id", "ID");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate now = LocalDate.now().plusMonths(3);
        String format = now.format(dateTimeFormatter);

        System.out.println(format);
    }
}
