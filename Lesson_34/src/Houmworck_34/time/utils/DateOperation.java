package Houmworck_34.time.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperation {

//  Этот метод принимает дату рождения в виде стринга,
//    и возвращающий возраст.

    public static int getAge(String birthDate) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date;
        if (birthDate.contains("/")) {
            date = LocalDate.parse(birthDate, formatter1);
        } else {
            date = LocalDate.parse(birthDate, formatter2);
        }
        return Period.between(date, LocalDate.now()).getYears();
    }

    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return Arrays.stream(dates)
                .sorted(Comparator.comparing(date -> {
                    if (date.contains("-")) {
                        return LocalDate.parse(date, formatter1);
                    } else {
                        return LocalDate.parse(date, formatter2);
                    }
                }))
                .toArray(String[]::new);
    }
}
