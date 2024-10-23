package Houmwork.zoo_park;
//private String ID;
//    private String type;
//    private int age;
//    private String nickname;
//    private boolean isMale;
//private String breed;
//    private double height;
//    private double weight;

import Houmwork.zoo_park.model.Cat;
import Houmwork.zoo_park.model.Dog;
import Houmwork.zoo_park.model.Pet;

public class HouseAppl {
    public static void main(String[] args) {
        Pet pet[] = new Pet[5];
        pet[0] = new Cat("C00010", "без шерсти", 2, "Joy", true, "Сфинкс", 0.4, 3.5);
        pet[1] = new Cat("C00011", "гладкошёрстый", 3, "Tom", false, "Веслоухий", 0.6, 4.5);
        pet[2] = new Cat("C00012", "Сказочный", 1, "Jery", false, "Чеширский", 1, 7);
        pet[3] = new Dog("D00020", "Борзая", 2, "Keks", true, "Афганская борзая", 1.4, 9);
        pet[4] = new Dog("D00021", "Бульдог", 1, "Pups", true, "Английский бульдог", 0.55, 8);

        String[] periodDay = {"Утром", "Денём", "Вечером", "Ночью"};

        for(String time : periodDay){
            System.out.println(" " + time + ":");
            for (Pet pets : pet) {
                System.out.print(pets.getNickname() + " ");
                switch (time) {
                    case "Утром":
                        System.out.print("просыпается и начинается ");
                        if (pets instanceof Cat) {
                            ((Cat) pets).voice();
                        } else if (pets instanceof Dog) {
                            ((Dog) pets).voice();
                        }
                        break;
                    case "Денём":
                        System.out.println("играет.");
                        break;
                    case "Вечером":
                        System.out.println("ест.");
                        break;
                    case "Ночью":
                        System.out.println("спит.");
                        break;
                }
            }
            System.out.println();
        }

    }
}