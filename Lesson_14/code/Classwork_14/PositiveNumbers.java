package Classwork_14;
// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Реализуйте метод, который получает на вход исходный массив и возвращает массив,
//содержащий только положительные числа из исходного массива.

public class PositiveNumbers {

    public static void main(String[] args) {

        int[] numbers = ArrayMethodsAll.fillArray(-100, 100, 20); // Заполняем массив случайными числами
        ArrayMethodsAll.printArray(numbers); // Печатаем исходный массив

        // Выводим количество положительных чисел
        int positiveCount = countPositiveNumbers(numbers);
        System.out.println("Количество положительных чисел: " + positiveCount);

        // Получаем массив с положительными числами
        int[] positiveNumbers = getPositiveNumbers(numbers);
        System.out.print("Массив с положительными числами: ");
        ArrayMethodsAll.printArray(positiveNumbers); // Печатаем новый массив с положительными числами
    }

    // Метод для подсчета количества положительных чисел
    public static int countPositiveNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для получения массива только с положительными числами
    public static int[] getPositiveNumbers(int[] array) {
        int count = countPositiveNumbers(array);
        int[] positiveNumbers = new int[count]; // Новый массив для положительных чисел

        int index = 0;
        for (int number : array) {
            if (number > 0) {
                positiveNumbers[index] = number;
                index++;
            }
        }
        return positiveNumbers;
    }

}
