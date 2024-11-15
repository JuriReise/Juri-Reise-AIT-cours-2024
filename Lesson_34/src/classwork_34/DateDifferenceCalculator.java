package classwork_34;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifferenceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод даты рождения
        System.out.print("Введите год рождения (например, 2000): ");
        int birthYear = scanner.nextInt();
        System.out.print("Введите месяц рождения (например, 5 для мая): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Введите день рождения: ");
        int birthDay = scanner.nextInt();

        // Ввод даты для сравнения
        System.out.print("Введите год другой даты: ");
        int compareYear = scanner.nextInt();
        System.out.print("Введите месяц другой даты: ");
        int compareMonth = scanner.nextInt();
        System.out.print("Введите день другой даты: ");
        int compareDay = scanner.nextInt();

        // Создаем объекты LocalDate для дат
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate compareDate = LocalDate.of(compareYear, compareMonth, compareDay);

        // Вычисляем разницу между датами
        calculateDifference(birthDate, compareDate);

        // Пример для текущей даты
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nС момента вашего рождения до текущей даты:");
        calculateDifference(LocalDate.from(birthDate.atStartOfDay()), now.toLocalDate());
    }

    // Метод для вычисления разницы между двумя датами
    public static void calculateDifference(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);

        // Время в годах, месяцах и днях
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Время в часах, минутах и секундах
        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atStartOfDay();
        long hours = ChronoUnit.HOURS.between(startDateTime, endDateTime);
        long minutes = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
        long seconds = ChronoUnit.SECONDS.between(startDateTime, endDateTime);

        System.out.println("Прошло:");
        System.out.println("Лет: " + years);
        System.out.println("Месяцев: " + months);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + seconds);
    }
}
