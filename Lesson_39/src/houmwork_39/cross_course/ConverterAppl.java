package houmwork_39.cross_course;

import java.util.Scanner;
import java.util.Set;
/*
Создайте enum с кодами валют и их текущими курсами к евро.
Убедитесь, что в списке нет дублирующихся кодов валют.
Выведите список валют и их курсов на экран.
Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.
 */



public class ConverterAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем доступные валюты
        Set<CurrencyEnum> availableCurrencies = CurrencyEnum.getAvailableCurrencies();

        // Выводим список валют и их курсов
        System.out.println("Список валют и их курсов к евро:");
        for (CurrencyEnum currency : availableCurrencies) {
            System.out.printf("%s: %.4f%n", currency.name(), currency.getRateToEuro());
        }

        // Запрашиваем у пользователя код валюты
        System.out.print("Введите код валюты для обмена на евро: ");
        String currencyCode = scanner.nextLine().toUpperCase();

        // Проверяем, существует ли введённая валюта
        boolean isValidCurrency = false;
        CurrencyEnum selectedCurrency = null;
        for (CurrencyEnum currency : availableCurrencies) {
            if (currency.name().equals(currencyCode)) {
                isValidCurrency = true;
                selectedCurrency = currency;
                break;
            }
        }

        // Если валюта найдена, запрашиваем сумму и конвертируем
        if (isValidCurrency && selectedCurrency != null) {
            System.out.print("Введите количество валюты: ");
            double amount = scanner.nextDouble();
            double result = selectedCurrency.convertToEuro(amount);
            System.out.printf("Вы получите %.2f евро при обмене %.2f %s%n", result, amount, currencyCode);
        } else {
            System.out.println("Введен неверный код валюты. Попробуйте снова.");
        }

        scanner.close();
    }
}

