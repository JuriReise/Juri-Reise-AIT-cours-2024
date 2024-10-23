package Houmworck;
// Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//    Распечатать последний символ строки. *
//    Найти позицию подстроки “Java” в строке. *
//    Проверить, содержит ли заданная строка подстроку “Java”. *
//    Заменить все символы “o” на “a”. *
//    Преобразуйте строку к верхнему регистру.*
//    Преобразуйте строку к нижнему регистру. *
//    Вырезать подстроку Java c помощью метода substring(). *
//    Проверить, заканчивается ли строка подстрокой “!!!”. *
//    Проверить, начинается ли строка подстрокой “I'm proud”. *


public class Task_1 {
    public static void main(String[] args) {

        // Last symbol

        String sentence = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println("Task: 1 - Распечатать последний символ строки:" + sentence);
        char lastSymbol = sentence.charAt(sentence.length() - 1);
        System.out.println("Последним символ предложения " + sentence + " является : " + lastSymbol);
        System.out.println("Done!");
        System.out.println();

        //Find the position of a substring
        System.out.println("Task 2 : 'Find the position of a substring' ");
        int positionOfSub = sentence.indexOf("Java");
        if (positionOfSub != -1){
            System.out.println("Позиция подстроки сова 'Java' :" + positionOfSub );
            System.out.println("Done!");
            System.out.println();

        } else {
            System.out.println("Task: 3. Проверить, содержит ли заданная строка подстроку “Java”");
            System.out.println("Подстрока 'Java' не найдена.");
            System.out.println("Done!");
            System.out.println();

        }
        boolean isFound = positionOfSub != -1;
        System.out.println("Слово 'Java' найдено: " + isFound);
        System.out.println("Done!");
        System.out.println();

        // Заменить все символы “o” на “a”.
        System.out.println("Task: 4, Заменить все символы “o” на “a” в предложении" + sentence);
        String change = sentence;
        System.out.println(change.replace("o", "@"));
        System.out.println("Done!");

        //    Преобразуйте строку к верхнему регистру.
        //    Преобразуйте строку к нижнему регистру.
        System.out.println("Task: 5-6. Преобразуйте строку" + sentence+ " к верхнему и нижнему регистру");
        String registerUp = sentence.toUpperCase();
        String registerDn = sentence.toLowerCase();
        System.out.println(registerUp);
        System.out.println();
        System.out.println(registerDn);
        System.out.println("Done!");
        System.out.println();

        //    Вырезать подстроку Java c помощью метода substring().
        //    Нужен метод для подсчёта индексов
        //    Перебираем каждый символ в строке и выводим его индекс
        System.out.println("Task: 7-9: \n" +
                "a) Вырезать подстроку Java c помощью метода substring().\n" +
                "b) Проверить, заканчивается ли строка подстрокой “!!!”.\n" +
                "c) Проверить, начинается ли строка подстрокой “I'm proud”.");
        System.out.println();
        System.out.println("Let`s go!");
        System.out.println(" a) Вырезать подстроку Java c помощью метода substring() из строки " + sentence);
        int index = sentence.indexOf("Java");
        if (index != -1){
            String substringJava = sentence.substring(index, index +4);
            System.out.println("Наша вырезанная строка: " + substringJava);
        } else
            System.out.println("Вырезанная строка не найдена");
        System.out.println("Done!");
        System.out.println();

        System.out.println(" b) Проверить, заканчивается ли строка " + sentence + " подстрокой “!!!”.");

        boolean endCheck = sentence.endsWith("!!!");
        System.out.println("Заканчивается ли строка предложения: " + sentence + " подстрокой - '!!!': " + endCheck);
        System.out.println("Done!");
        System.out.println();

        System.out.println(" c) Проверить, начинается ли строка " + sentence + " подстрокой (I'm proud)");
        boolean startsCheck = sentence.startsWith("I'm proud");
        System.out.println("Строка начинается подстрокой 'I'm proud': " + startsCheck);
        System.out.println("Done!");


    } // end of main

} // end of class
