package se.fabricioflores.systemarchitecturelabone.functional;

import se.fabricioflores.systemarchitecturelabone.Product;

import java.util.function.Function;
import java.util.function.Predicate;

public class Discount {
    private final Predicate<Product> isApplicable;
    private final Function<Product, Double> calculateDiscount;
    private final String description;

    public Discount(
            Predicate<Product> isApplicable,
            Function<Product, Double> calculateDiscount,
            String description)
    {
        this.isApplicable = isApplicable;
        this.calculateDiscount = calculateDiscount;
        this.description = description;
    }

    public double apply(Product product) {
        if(isApplicable.test(product)) {
            return  calculateDiscount.apply(product);
        }
        return 0.0;
    }

    public String getDescription() {
        return this.description;
    }
}
