package Houmwork_38.temperatur_Bayern;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TemperatureAppl {
    public static void main(String[] args) {
        List<DayTemperature> temperatures = new LinkedList<>();

        //
        temperatures.add(new DayTemperature(LocalDate.of(2024, 10, 25), 11.1));
        temperatures.add(new DayTemperature(LocalDate.of(2024, 10, 26), 11.1));


        // Создание экземпляра Temperature
        Temperature temperature = (Temperature) new TemperatureImpl();


        double averageTemp = temperature.calculateAverageTemperature(temperatures);
        DayTemperature minTempDay = temperature.findMinTemperatureDay(temperatures);
        DayTemperature maxTempDay = temperature.findMaxTemperatureDay(temperatures);


        System.out.println("Средняя температура: " + averageTemp + " °C");
        System.out.println("День с минимальной температурой: " + minTempDay.getDate() + " (" + minTempDay.getTemperature() + " °C)");
        System.out.println("День с максимальной температурой: " + maxTempDay.getDate() + " (" + maxTempDay.getTemperature() + " °C)");
    }
}

