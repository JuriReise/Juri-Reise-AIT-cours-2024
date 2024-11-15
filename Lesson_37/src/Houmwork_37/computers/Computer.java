package Houmwork_37.computers;
/*
На основе класса Computer:

    создать собственный ArrayList;+
    добавить в него не менее 6 элементов; добавим видеокарту gpuSize +
    отсортировать список по бренду; +
    отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM; +
    подсчитать общий суммарный объем и среднее значение SSD. +

 */

import java.util.Objects;

public class Computer {

    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private double price;
    private int gpuSize; // размер видеокарты в МБ

    public Computer(String cpu, int ram, int ssd, String brand, double price, int gpuSize) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.gpuSize = gpuSize;
    }

    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }
    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }
    public int getSsd() { return ssd; }
    public void setSsd(int ssd) { this.ssd = ssd; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getGpuSize() { return gpuSize; }
    public void setGpuSize(int gpuSize) { this.gpuSize = gpuSize; }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", gpuSize=" + gpuSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Double.compare(price, computer.price) == 0 &&
                gpuSize == computer.gpuSize && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, price, gpuSize);
    }
}