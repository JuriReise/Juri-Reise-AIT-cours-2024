package classwork_34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Шаг 1: Ввод исходной даты
            System.out.print("Введите дату (например, 25-10-2023): ");
            String inputDate = scanner.nextLine();

            // Шаг 2: Ввод исходного формата
            System.out.print("Введите формат исходной даты (например, dd-MM-yyyy): ");
            String inputFormat = scanner.nextLine();
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inputFormat);

            // Шаг 3: Парсинг даты с использованием исходного формата
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);

            // Шаг 4: Ввод целевого формата
            System.out.print("Введите желаемый формат для преобразования (например, yyyy/MM/dd): ");
            String outputFormat = scanner.nextLine();
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outputFormat);

            // Шаг 5: Вывод преобразованной даты
            String formattedDate = date.format(outputFormatter);
            System.out.println("Преобразованная дата: " + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты. Проверьте ввод и попробуйте снова.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неверный формат ввода.");
        } finally {
            scanner.close();
        }
    }
}

