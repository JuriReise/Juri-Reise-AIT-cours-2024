package classwork_34;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Times {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Пример условия для текущей даты и времени
        if (currentDateTime.isAfter(LocalDateTime.of(2024, 10, 28, 10, 0))) {
            System.out.println("Сегодня после 10:00 28 октября 2024 года!");
        } else {
            System.out.println("Еще не наступило 10:00 28 октября 2024 года.");
        }
        LocalDate currentDate = LocalDate.now();

        // Пример условия для текущей даты
        if (currentDate.equals(LocalDate.of(2024, 10, 28))) {
            System.out.println("Сегодня 28 октября 2024 года!");
        } else {
            System.out.println("Сегодня не 28 октября 2024 года.");
        }

    }
}

