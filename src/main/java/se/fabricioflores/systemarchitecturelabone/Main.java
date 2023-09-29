package se.fabricioflores.systemarchitecturelabone;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Ball", 8, 3);
        Product p2  = new Product("Camera", 15, 7);
        Product p3 = new Product("Milk", 3, 2);


//       Discount discount = new MilkDiscount(new FridayDiscount(new QuantityDiscount((new RootDiscount()))));
//        System.out.println("Discount amount: " + discount.apply(p3));
//        System.out.println(discount.getDescription(p3));
//


        Discount discount = new FridayDiscount(new QuantityDiscount((new RootDiscount())));
        System.out.println("Discount amount: " + discount.apply(p2) + "kr");
        System.out.println(discount.getDescription(p2));
    }
}