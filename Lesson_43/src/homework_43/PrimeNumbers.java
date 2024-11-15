package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Отбор простых чисел
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .collect(Collectors.toList());

        // Вывод результата
        System.out.println("Prime numbers: " + primeNumbers);
    }

    // проверка на простое число
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}

