package Houmworck_22.Task_3;
/* Создать класс Address, проверить:

    город с большой буквы
    индекс содержит 5 цифр
    предложите еще тесты
*/

public class Address {
    private String city; // Город
    private String indexOfCity; // Индекс

    // Cons-or
    public Address(String city, String postalCode) {
        this.city = city;
        this.indexOfCity = postalCode;
    }


    // Метод для проверки, что город начинается с заглавной буквы
    public boolean upLitters() {
        if (city == null || city.isEmpty()) {
            return false;
        }
        // Проверяем, что первый символ - заглавная буква
        return Character.isUpperCase(city.charAt(0));
    }

    // Метод для проверки, что индекс состоит из 5 цифр
    public boolean isPostalCodeValid() {
        // Проверяем, что длина индекса 5 и все символы являются цифрами
        return indexOfCity.matches("\\d{5}");
    }

    // get
    public String getCity() {
        return city;
    }

    public String getIndexOfCity() {
        return indexOfCity;
    }

}
