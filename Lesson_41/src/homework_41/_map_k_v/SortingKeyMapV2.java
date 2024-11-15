package homework_41._map_k_v;

import java.util.*;

import java.util.*;

public class SortingKeyMapV2 {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "France");
        states.put(4, "Italy");

        // Создаем отсортированный TreeMap с компаратором
        SortedMap<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // Сортировка по возрастанию
            }
        });
        /*
        И, конечно, все можно переписать, используя лямбды:
        SortedMap<Integer, String> sortedMap = new TreeMap<>(Comparator.comparingInt(o -> o));
         */

        // Добавляем все элементы из HashMap в TreeMap
        sortedMap.putAll(states);

        // Выводим отсортированные элементы
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

