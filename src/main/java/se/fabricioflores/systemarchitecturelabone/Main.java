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
//        System.out.println("Final price: "+ p3.getPrice());


        //  Get negative price cuz I am applying discount to the price of one product when the product quantity is 7.
        //  I could fix this by overriding the apply method for QuantityDiscount but i still don't know if should change the price of the product or not
        // ???
        Discount discount = new QuantityDiscount((new RootDiscount()));
        System.out.println("Discount amount: " + discount.apply(p2));
        System.out.println(discount.getDescription(p2));

        System.out.println("Final price: "+ p2.getPrice());
    }
}