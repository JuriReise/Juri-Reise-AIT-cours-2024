package Houmwork_26.ait.warehouse.model;

public class Gear extends Detail {
    private double radius;
    private int tooth;

    public Gear(long barCode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    @Override
    public void printInfo() {
        System.out.println("Gear: barCode=" + barCode + ", radius=" + radius + ", tooth=" + tooth);
    }
}
