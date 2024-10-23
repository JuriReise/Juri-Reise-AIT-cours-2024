

public class MathMetod2 {

    public static void main(String[] args) {

        // евро в британские фунты

        double money = 200; // Euro
        double Funts = exchangeEuroToFunt(money);
        System.out.println("1000 Euro kostet: " + Funts); // как лобавить текст после значения?

        // евро в доллары США

        double moneyE = 1100; // Euro
        double Dollars = exchangeEuroDollars(moneyE);
        System.out.println("1000 Euro kostet: " + Dollars);

        // Программа для конвертации валюты
        double moneEuro = 100;
        double moneyAny = exchangeFormEuroToOther(moneEuro);
        System.out.println("Курс Доллара, Евро и китайского Юана к Евро составляет" + moneyAny);

        // евро в китайские юани и проверьте их работу, вызвав их в main
        // Метод, который переводит градусы Цельсия в градусы по Фаренгейту.
        // Вызовите метод в main.
        // Метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.


    } // end of main

    public static double exchangeFormEuroToOther(double moneyAny){
        double rateJ = 7.87; // Юань
        double rateD = 1.11; // Доллар
        double rateF = 0.84; // Фунт
        return moneyAny * rateJ;


    } // exchangeFormEuroToOther

    public static double exchangeEuroToFunt(double money){
        double rate = 0.84;
        return money * rate;

    } // end of main exchangeEuroToFunt

    public static double exchangeEuroDollars(double moneyE){
        double rate = 1.12;
        return moneyE * rate;

    } // end of main exchangeEuroDollars


} // end of class
