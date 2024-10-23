package Classwork_04;

public class MathMetod {



    public static void main(String[] args) {

        // перевод доллара в евро
        double money = 500; // dollars
        double euro = exchangeDollarsToEuri(money);
        System.out.println("Euro: " + euro);

        // количество съеденых колорий
        double weiht = 200; //gramm
        double calorage = 50; // calorie on 100 gramm

        double energy = calculateDalorie(weiht, calorage);
        System.out.println("Полученные калории = " + energy);

        // расход топлива и стоимости поездки
        // длина пути
        // кол.литров на 100км ри скорости 82км/час
        // кол.литров на 100км ри скорости 130км/час
        double wey = 300;  // пройденное растояние
        double consumption82 = 6.5; // расход при скорости 82km/ч
        double consumption100 = 6.8; // расход при скорости 100km/ч
        double consumption130 = 7.2; // расход при скорости 130km/ч

        double total82 = fuelConsumption82(wey, consumption82);
        double total100 = fuelConsumption100(wey, consumption100);
        double total130 = fuelConsumption130(wey, consumption130);
        double averageby300 = onAverageBy300(wey, consumption82, consumption100, consumption130);
        System.out.println("Всего потрачено топлива на 300 км при скорости 82км/ч =" + total82);
        System.out.println("Всего потрачено топлива на 300 км при скорости 100км/ч =" + total100);
        System.out.println("Всего потрачено топлива на 300 км при скорости 130км/ч =" + total130);
        System.out.println("Средний расход топлива на 300 км при изменяемой скорости от 82 до 130км/ч =" + averageby300 );

        // высчитать средний расход топлива на 300 км
        // в диапасзоне изменяющейся скорости от 82 до 130 км/ч



    } // end of main

    private static double fuelConsumption82(double wey, double consumption82){
        return wey * consumption82 / 100;

    } // end of method (fuelConsumption82)
    private static double fuelConsumption100(double wey, double consumption100){
        return wey * consumption100 / 100;

    } // end of method (fuelConsumption100)

    private static double fuelConsumption130(double wey, double consumption130) {
        return wey * consumption130 / 100;

    } // end of method (fuelConsumption130)

     // on average by 300
    private static double onAverageBy300(double wey, double consumption130, double consumption82, double consumption100){
        return (300 * ((consumption100 + consumption82 + consumption130) / 3)) / 100;

    }


     //  Мотод для калорий
    private static double calculateDalorie(double weight, double calorage) {
        return weight * calorage / 100;

    } // end of method (calorie)


     // метод для конвертации
    private static double exchangeDollarsToEuri(double money) {
        double rate = 0.9;
        return money * rate;

    } // end of method (exchange)

} // end of class
