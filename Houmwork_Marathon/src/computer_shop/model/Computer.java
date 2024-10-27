
package computer_shop.model;

import java.util.Objects;

public class Computer {
    private String id;
    private String brand;
    private String model;
    private double price;

    public Computer(String id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.price, price) == 0 &&
                Objects.equals(id, computer.id) &&
                Objects.equals(brand, computer.brand) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
