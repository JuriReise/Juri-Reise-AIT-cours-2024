package homework_42.one_million_numbers;

//В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqAppl {
    public static void main(String[] args) {

        Random random = new Random();
        int number = 0;
        int digit = 0;

        Map< Integer , Integer> resultMap = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            number = random.nextInt(100, 1000);
            //число надо разобрать по цифрам
            while (number > 0){
                digit = number % 10;
                // цифру надо отправить в map и подсчитать частоту появления цифр от 0 до 9
                if(!resultMap.containsKey(digit)){ // когда слово попалось 1-й раз
                    resultMap.put(digit, 1);
                } else { // когда слово уже такое есть в Map
                    resultMap.put(digit, resultMap.get(digit) + 1); // увеличиваем частоту на 1
                }
                number = number / 10;
            }
        }

        // print resultMap
        for (Integer d : resultMap.keySet()) {
            System.out.println("Digit: " + d + ", frequency: " + resultMap.get(d));
        }

    }
}
