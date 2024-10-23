package Houmworck_19;

import Houmworck_19.model.Food;
import Houmworck_19.model.MeatFood;
import Houmworck_19.model.MilkFood;
import Houmworck_19.model.Product;
// private double price;
//    private String name;
//    private long barCode;
// private String expDate;

//private String meatType;

//private String milkType;
//  private double fat;

public class MarketAppl {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Food(0.99, "Brodchen", 566655987L, "09-10-2024"),
                new MeatFood(11.99, "Piggy Peppa", 987456321L, "20-10-2024", "Schwein"),
                new MilkFood(1.99, "Milk Danon", 123456789L, "20-10-2024", "Fat Milk", 3.5)
        };

        allProducts(products);
        System.out.println("Total Price: $" + totalPrice(products));

        // ищем товар по баркоду
        long barCodeToFind = 987456321L;
        Product foundProduct = findBarCode(products, barCodeToFind);
        if (foundProduct != null) {
            System.out.println("Продукт найден: " + foundProduct);
        } else {
            System.out.println("Товар с BarCode " + barCodeToFind + " Не найден.");
        }

        // НЕпищевые продукты
        System.out.println("Non-food products:");
        NonFood(products);
    }

    public static void allProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static double totalPrice(Product[] products) {
        double sumPrice = 0.0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        return sumPrice;
    }

    public static Product findBarCode(Product[] products, long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null; // Если продукт не найден
    }

    public static void NonFood(Product[] products) {
        for (Product product : products) {
            if (!(product instanceof Food)) {
                System.out.println(product);
            }
        }
    }
}
