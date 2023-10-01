package se.fabricioflores.systemarchitecturelabone.functional;

import se.fabricioflores.systemarchitecturelabone.Product;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 5000, 1);
        Product p2 = new Product("Milk", 15, 1);
        Product p3 = new Product("Keyboard", 500, 5);

        System.out.println("Friday Discount: " + fridayDiscount.apply(p1));
        System.out.println("Milk Discount: " + milkDiscount.apply(p2));
        System.out.println("Quantity Discount: " + quantityDiscount.apply(p3));
    }

    public static Discount fridayDiscount = new Discount(
            product -> {
                String day = String.valueOf(LocalDateTime.now().getDayOfWeek());
                return day.equals("FRIDAY");
            },
            product -> product.getPrice() * 0.10,
            "Friday Discount 10%"
    );

    public static Discount milkDiscount = new Discount(
            product -> product.getName().equalsIgnoreCase("Milk"),
            product -> product.getPrice() * 0.05,
            "Milk Discount 5%"
    );

    public static Discount quantityDiscount = new Discount(
            product -> product.getQuantity() >= 5,
            product -> (double) (product.getQuantity() * 10),
            "Quantity Discount"
    );
}
