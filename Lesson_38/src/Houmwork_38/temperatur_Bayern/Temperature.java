package Houmwork_38.temperatur_Bayern;
/*
Сформируйте два ArrayList и внесите в них данные измерений температуры. +

 */

import java.util.List;

public interface Temperature {

    double calculateAverageTemperature(List<DayTemperature> temperatures);
    DayTemperature findMinTemperatureDay(List<DayTemperature> temperatures);
    DayTemperature findMaxTemperatureDay(List<DayTemperature> temperatures);

}
