
package computer_shop.model;

public class Laptop extends Computer {
    private double displaySize;

    public Laptop(String id, String brand, String model, double price, double displaySize) {
        super(id, brand, model, price);
        this.displaySize = displaySize;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    @Override
    public String toString() {
        return super.toString() + ", displaySize=" + displaySize + '}';
    }
}
