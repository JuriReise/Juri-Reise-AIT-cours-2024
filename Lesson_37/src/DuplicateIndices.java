import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateIndices {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        // Создаем карту для хранения индексов повторяющихся элементов
        Map<String, List<Integer>> duplicates = new HashMap<>();

        // Заполняем карту
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            // Если элемент уже есть в карте, добавляем текущий индекс в его список
            if (duplicates.containsKey(element)) {
                duplicates.get(element).add(i);
            } else {
                // Иначе создаем новый список с текущим индексом
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                duplicates.put(element, indices);
            }
        }

        // Выводим индексы только для тех элементов, у которых есть повторения
        for (Map.Entry<String, List<Integer>> entry : duplicates.entrySet()) {
            if (entry.getValue().size() > 1) { // Проверяем, что элемент повторяется
                System.out.println("Элемент '" + entry.getKey() + "' имеет индексы: " + entry.getValue());
            }
        }
    }
}
