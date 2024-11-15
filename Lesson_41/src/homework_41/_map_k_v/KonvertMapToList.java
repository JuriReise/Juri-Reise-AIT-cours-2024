package homework_41._map_k_v ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KonvertMapToList {

    // Метод для конвертации ключей Map в ArrayList
    public static List<String> convertKeysToList(Map<String, Person> map) {
        return new ArrayList<>(map.keySet());
    }

    // Метод для конвертации значений Map в ArrayList
    public static List<Person> convertValuesToList(Map<String, Person> map) {
        return new ArrayList<>(map.values());
    }

    // Метод для конвертации пар ключ-значение Map в ArrayList
    public static List<Map.Entry<String, Person>> convertEntriesToList(Map<String, Person> map) {
        return new ArrayList<>(map.entrySet());
    }
}


