package Houmwork_14;

public class MultipleOfSeventeen {
    public static void main(String[] args) {
        int multiple = 17;  // Число, кратные которому будем искать
        int start = 10;     // Начало диапазона
        int end = 99;       // Конец диапазона

        System.out.println("Кратные числа 17 в диапазоне от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % multiple == 0) {  // Если число кратно 17
                System.out.println(i);
            }
        }
    }


}// end of ckass
