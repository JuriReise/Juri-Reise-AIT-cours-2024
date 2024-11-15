package homework_43.computer.model;

public class Computer {
    private int ram;
    private int ssd;
    private String gpu;
    private String cpu;
    private String brand;
    private double price;
    private String formFactor; // ATX, miniATX, Slim

    public Computer(int ram, int ssd, String gpu, String cpu, String brand, double price, String formFactor) {
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
        this.cpu = cpu;
        this.brand = brand;
        this.price = price;
        this.formFactor = formFactor;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getGpu() {
        return gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getFormFactor() {
        return formFactor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", gpu='" + gpu + ''' +
                ", cpu='" + cpu + ''' +
                ", brand='" + brand + ''' +
                ", price=" + price +
                ", formFactor='" + formFactor + ''' +
                '}';
    }
}
