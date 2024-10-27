
package computer_shop.model;

public class Smartphone extends Computer {
    private int batteryCapacity;

    public Smartphone(String id, String brand, String model, double price, int batteryCapacity) {
        super(id, brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity=" + batteryCapacity + '}';
    }
}
