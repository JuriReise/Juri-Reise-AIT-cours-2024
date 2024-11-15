package homework_41._map_k_v;

import java.util.*;

public class SortingKeyMapV1 {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "France");
        states.put(4, "Italy");

        // Конвертируем Map в List для сортировки
        List<Map.Entry<Integer, String>> list = new ArrayList<>(states.entrySet());

        // Сортируем List по ключам
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        /* Сокращенный вариант сортировки по ключу
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getKey));
        */

        // Выводим отсортированные пары ключ-значение
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
