package homework_41._map_k_v;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "France");
        states.put(4, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        // порлучим весь набор ключей
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        //получить набор всех значений
        Collection<String> values = states.values();
        System.out.println(values);
        // заменить элемент
        states.replace(1, "Poland");
        // вызовем объект по ключу 1 и посмотрим результат замены
        String newElement = states.get(1);
        System.out.println(newElement);
        // удаление элемента по ключу 2
        states.remove(2);
        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        System.out.println("пребор всех значений МАР используя итератор Вариант 2: ");
        // пребор всех значений МАР используя итератор Вариант 2

        Iterator<Map.Entry<Integer, String>> itr = states.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, String> entry =  itr.next();

            Integer key = entry.getKey();

            String value = entry.getValue();
            System.out.printf("Key: %d  Value: %s \n", entry.getKey(), entry.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
        System.out.println("Конвертируем Map в ArrayList с помощью KonvertMapToList");

        // Получаем список ключей
        List<String> keyList = KonvertMapToList.convertKeysToList(people);
        System.out.println("Keys: " + keyList);

        // Получаем список значений
        List<Person> valueList = KonvertMapToList.convertValuesToList(people);
        System.out.print("Values: ");
        for (Person person : valueList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        // Получаем список пар ключ-значение
        List<Map.Entry<String, Person>> entryList = KonvertMapToList.convertEntriesToList(people);
        System.out.println("Entries: ");
        for (Map.Entry<String, Person> entry : entryList) {
            System.out.printf("Key: %s, Value: %s\n", entry.getKey(), entry.getValue().getName());
        }
    }
}


