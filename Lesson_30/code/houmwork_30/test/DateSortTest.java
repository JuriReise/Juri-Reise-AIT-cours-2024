package houmwork_30.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            // TODO Homework
            return 0;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            // Разбиваем даты на компоненты: день, месяц, год
            String[] parts1 = s1.split("-");
            String[] parts2 = s2.split("-");

            int day1 = Integer.parseInt(parts1[0]);
            int month1 = Integer.parseInt(parts1[1]);
            int year1 = Integer.parseInt(parts1[2]);

            int day2 = Integer.parseInt(parts2[0]);
            int month2 = Integer.parseInt(parts2[1]);
            int year2 = Integer.parseInt(parts2[2]);

            // Сравниваем годы
            int yearComparison = Integer.compare(year1, year2);
            if (yearComparison != 0) {
                return yearComparison;
            }

            // Если годы одинаковые, сравниваем месяцы
            int monthComparison = Integer.compare(month1, month2);
            if (monthComparison != 0) {
                return monthComparison;
            }

            // Если месяцы тоже одинаковые, сравниваем дни
            return Integer.compare(day1, day2);
        };
    }

}
