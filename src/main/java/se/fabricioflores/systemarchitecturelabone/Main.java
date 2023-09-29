package se.fabricioflores.systemarchitecturelabone;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Ball", 8, 3);
        Product p2  = new Product("Camera", 15, 7);
        Product p3 = new Product("Milk", 3, 2);

        Discount discount = new MilkDiscount(new QuantityDiscount(new FridayDiscount((new RootDiscount()))));

        System.out.println("Ball");
        System.out.println("-----");
        System.out.println("Discount amount: " + discount.apply(p1) + "kr");
        System.out.println(discount.getDescription(p1));

        System.out.println("\nCamera");
        System.out.println("--------");
        System.out.println("Discount amount: " + discount.apply(p2) + "kr");
        System.out.println(discount.getDescription(p2));

        System.out.println("\nMilk");
        System.out.println("--------");
        System.out.println("Discount amount: " + discount.apply(p3) + "kr");
        System.out.println(discount.getDescription(p3));
    }
}