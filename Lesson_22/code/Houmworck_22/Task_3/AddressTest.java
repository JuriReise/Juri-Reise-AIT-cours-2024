package Houmworck_22.Task_3;
/* Создать класс Address, проверить:

    город с большой буквы
    индекс содержит 5 цифр
    предложите еще тесты
*/

public class AddressTest {
    public static void main(String[] args) {
        // Пример 1: Город с большой буквы и индекс из 5 цифр
        Address address1 = new Address("Moscow", "12345");
        System.out.println("Тест 1: Город с заглавной буквы и корректный индекс");
        System.out.println("Город с большой буквы? " + address1.upLitters()); // Ожидается true
        System.out.println("Индекс корректный? " + address1.isPostalCodeValid()); // Ожидается true

        // Пример 2: Город с маленькой буквы и некорректный индекс
        Address address2 = new Address("moscow", "12A45");
        System.out.println("\nТест 2: Город с маленькой буквы и некорректный индекс");
        System.out.println("Город с большой буквы? " + address2.upLitters()); // Ожидается false
        System.out.println("Индекс корректный? " + address2.isPostalCodeValid()); // Ожидается false

        // Пример 3: Пустой город и индекс неправильной длины
        Address address3 = new Address("", "1234");
        System.out.println("\nТест 3: Пустой город и индекс неправильной длины");
        System.out.println("Город с большой буквы? " + address3.upLitters()); // Ожидается false
        System.out.println("Индекс корректный? " + address3.isPostalCodeValid()); // Ожидается false
    }

}
