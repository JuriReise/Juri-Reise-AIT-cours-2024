package Houmwork_38.temperatur_Bayern;
/*
Рассчитайте среднюю температуру в городе за прошедшие две недели.
В какой день была минимальная температура? В какой день максимальная?
 */

import java.util.List;

public class TemperatureImpl implements Temperature {  // Добавлено implements Temperature

    @Override
    public double calculateAverageTemperature(List<DayTemperature> temperatures) {
        double total = 0;
        for (DayTemperature day : temperatures) {
            total += day.getTemperature();
        }
        return total / temperatures.size();
    }

    @Override
    public DayTemperature findMinTemperatureDay(List<DayTemperature> temperatures) {
        DayTemperature minDay = temperatures.get(0);
        for (DayTemperature day : temperatures) {
            if (day.getTemperature() < minDay.getTemperature()) {
                minDay = day;
            }
        }
        return minDay;
    }

    @Override
    public DayTemperature findMaxTemperatureDay(List<DayTemperature> temperatures) {
        DayTemperature maxDay = temperatures.get(0);
        for (DayTemperature day : temperatures) {
            if (day.getTemperature() > maxDay.getTemperature()) {
                maxDay = day;
            }
        }
        return maxDay;
    }
}
