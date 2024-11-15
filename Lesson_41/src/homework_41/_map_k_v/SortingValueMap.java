package homework_41._map_k_v;

import java.util.*;

public class SortingValueMap {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "France");
        states.put(4, "Italy");

        // Конвертируем Map в List для сортировки по значениям
        List<Map.Entry<Integer, String>> list = new ArrayList<>(states.entrySet());

        // Сортируем List по значениям
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        /*
        И лямбда для этого выглядит так:

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
         */

        // Если нужен Map с сохранением порядка, можно использовать LinkedHashMap
        Map<Integer, String> sortedByValueMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedByValueMap.put(entry.getKey(), entry.getValue());
        }

        // Выводим отсортированные элементы
        for (Map.Entry<Integer, String> entry : sortedByValueMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

