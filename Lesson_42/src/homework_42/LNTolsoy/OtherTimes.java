package homework_42.LNTolsoy;

import java.util.*;

public class OtherTimes {

    public static void main(String[] args) {
        // Текст Л.Н.Толстого
        String text = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, "
                + "ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, "
                + "ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, "
                + "ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, "
                + "когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню "
                + "домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге "
                + "и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные "
                + "осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, "
                + "на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, "
                + "когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин "
                + "и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, "
                + "наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, "
                + "когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, "
                + "мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. "
                + "был съезд помещиков, и кончались дворянские выборы.";

        // Удаление знаков препинания и приведение к нижнему регистру text = text.replaceAll("[^a-zA-Z0-9\s]", "").toLowerCase();
        // не охватывает Русские сиволы!
        // Приводим текст к нижнему регистру и убираем знаки препинания
        text = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");
        System.out.println("Общее количество слов: " + words.length);

        // Создаем Map для подсчета частоты слов
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // повторяющиеся и уникальные слова
        Map<String, Integer> repeatingWords = new HashMap<>();
        List<String> singleUseWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.put(entry.getKey(), entry.getValue());
            } else {
                singleUseWords.add(entry.getKey());
            }
        }

        // Выводим результаты
        System.out.println("Общее количество повторяющихся слов: " + repeatingWords.size());
        System.out.println("Список слов, которые используются 2 и более раз:");
        for (Map.Entry<String, Integer> entry : repeatingWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Остальные слова используются только один раз.");

        // Запрос подтверждения у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Желаете увидеть эти слова? (да/нет):");
        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("да")) {
            System.out.println("\nСлова, которые используются только один раз:");
            for (String word : singleUseWords) {
                System.out.println(word);
            }
        } else {
            System.out.println("Список слов, которые используются один раз, не будет показан.");
        }
    }
}

