package Houmwork_26.ait.warehouse.model;

public class Lever extends Detail {
    private double power;

    public Lever(long barCode, double size, String material, String vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }

    @Override
    public void printInfo() {
        System.out.println("Lever: barCode=" + barCode + ", power=" + power);
    }
}
