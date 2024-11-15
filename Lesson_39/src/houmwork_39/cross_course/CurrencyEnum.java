package houmwork_39.cross_course;


import java.util.HashSet;
import java.util.Set;

public enum CurrencyEnum {
    USD(1.1),     // Курс USD к евро
    GBP(0.85),    // Курс GBP к евро
    JPY(0.0075),  // Курс JPY к евро
    CHF(0.92),    // Курс CHF к евро
    CNY(0.13);    // Курс CNY к евро

    private double rateToEuro;

    CurrencyEnum(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    // Конвертация валюты в евро
    public double convertToEuro(double amount) {
        return amount * rateToEuro;
    }

    // Получение доступных валют как HashSet
    public static Set<CurrencyEnum> getAvailableCurrencies() {
        Set<CurrencyEnum> availableCurrencies = new HashSet<>();
        for (CurrencyEnum currency : CurrencyEnum.values()) {
            availableCurrencies.add(currency);
        }
        return availableCurrencies;
    }
}
