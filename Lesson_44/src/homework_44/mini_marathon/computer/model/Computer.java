package homework_44.mini_marathon.computer.model;

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
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", gpu='").append(gpu).append('\'');
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", formFactor='").append(formFactor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
