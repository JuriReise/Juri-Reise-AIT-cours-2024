package Houmwork_07;

public class SportsMan {
    public static void main(String[] args) {

        double s = 5.0; // Начальный пробег (например, 5 км)
        double target = 50.0; // Целевой пробег (например, 20 км)

        int days = 1; // Счетчик дней начинается с 1
        double distance = s;

        // Увеличиваем пробег на 10% каждый день, пока не достигнем цели
        while (distance < target) {
            distance += distance * 0.1; // Увеличение на 10%
            days++;
        }

        System.out.println("Номер дня, на который пробег составит не менее " + target + " км: " + days);
    }
}
