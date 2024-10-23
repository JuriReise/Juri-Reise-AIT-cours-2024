package Houmwork_06;

public class TimeOfYear2If {

    public static String getSeason(int numMoth) {
        if (numMoth > 2 && numMoth < 6)
            return "Весна";
        if (numMoth > 5 && numMoth < 9)
            return "Лето";
        if (numMoth > 8 && numMoth < 12)
            return "Осень";
        return "Зима";
    }
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            System.out.printf("%d месяц - %s\n",i,getSeason(i));
        }
    }

} // end of class
