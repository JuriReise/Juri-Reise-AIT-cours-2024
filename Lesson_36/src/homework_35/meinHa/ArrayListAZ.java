package homework_35.meinHa;
//Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class ArrayListAZ {



    public class AlphabetArrayList {
        public static void main(String[] args) {
            ArrayList<Character> alphabetList = new ArrayList<>();

            // Заполняем ArrayList буквами латинского алфавита
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                alphabetList.add(letter);
            }

            // Выводим содержимое списка
            System.out.println(alphabetList);
        }
    }
}
