public class Main2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            // Попытка деления на ноль
            int result = a / b;

            System.out.println("Результат: " + result); // Этот код не выполнится
        } catch (ArithmeticException e) {
            // Обработка ошибки
            System.out.println("Ошибка: деление на ноль невозможно!");

        }
        System.out.println("Программа продолжает работу.");


    }
}