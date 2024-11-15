package Houmwork_37.Galaxy;
/*
Задача 2. Занести планеты солнечной системы в список, содержащий:

    наименование; +
    расстояние до Солнца; +
    массу; +
    количество спутников. +

Вывести список планет отсортированный по:

    порядку расположения в солнечной системе; +
    алфавиту; +
    массе; +
 */

public class Planet {
    private String name;
    // Расстояние до Солнца в миллионах километров
    private double distanceFromSun;
    // Масса в килограммах (можно использовать степени)
    private double mass;
    // Количество спутников
    private int satelliteCount;
    // Порядок от Солнца
    private int orderFromSun;

    // Const-or
    public Planet(String name, double distanceFromSun, double mass, int satelliteCount, int orderFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.satelliteCount = satelliteCount;
        this.orderFromSun = orderFromSun;
    }

    // Gets
    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    // toString для информации о планете
    @Override
    public String toString() {
        return "Planet{name='" + name + "', distanceFromSun=" + distanceFromSun +
                ", mass=" + mass + ", satelliteCount=" + satelliteCount +
                ", orderFromSun=" + orderFromSun + "}";
    }
}

