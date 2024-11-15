package homework_35.meinHa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAufSeite {
    public static void main(String[] args) {
        // инициализация
        ArrayList<String> cars = new ArrayList<String>();
        // поля массива
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");


        //добавление элемента по индексу
        cars.add(0,"Mazda");
        System.out.println(cars);
        // доступ к элементу
        cars.get(0);
        // изменение элемента
        cars.set(0, "Opel");
        // удаление элемента
        cars.remove(0);
        // полная очистка листа
        cars.clear();
        // получение элементов в массиве
        cars.size();
        // loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i);

        }
        // for-each
        for (String i : cars) {
            System.out.println(i);
        }
        // Другие типы массива
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        // сортировка
       // ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        // пример сортировке целых чисел
        //ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }


    }
}

