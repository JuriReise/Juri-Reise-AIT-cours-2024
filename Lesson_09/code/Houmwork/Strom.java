package Houmwork;

public class Strom {

    // Создаём calculateHourlyConsumption метод для расчета электроэнергии в час
    // дляя холодильника и кондиционера
    public static double calculateHourlyConsumption(double refrigerator, double conditioner) {
        return refrigerator + conditioner;
    }

    // Затраты на электроэнергию в месяц
    // надо просумировать электроэнергию
    // Переводим в кВт·ч и считаем стоимость
    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKWh, int hoursInMonth) {
        double monthlyConsumption = hourlyConsumption * hoursInMonth;
        return (monthlyConsumption / 1000) * costPerKWh;
    }

    public static void main(String[] args) {

        double fridgePower = 150;
        double acPower = 2000;

        double costPerKWh = 0.15;

        int hoursInMonth = 30 * 24;

        // Рассчитываем потребление энергии в час
        double hourlyConsumption = calculateHourlyConsumption(fridgePower, acPower);
        System.out.println("Общее потребление электроэнергии в час составило : " + hourlyConsumption + " Вт");

        double monthlyCost = calculateMonthlyCost(hourlyConsumption, costPerKWh, hoursInMonth);
        System.out.println("Анна тратит на электроэнергию в месяц: " + monthlyCost + " евро");

    } //end of main


} // end of class
