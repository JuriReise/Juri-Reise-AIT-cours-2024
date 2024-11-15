package Houmwork_38.temperatur_Bayern;
/*
Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
Создайте класс DayTemperature +
 c полями:
Дата LocalDate; +
double temperature; +

 */

import java.time.LocalDate;

public class DayTemperature {

    private LocalDate date;
    private double temperature;

    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }
}
