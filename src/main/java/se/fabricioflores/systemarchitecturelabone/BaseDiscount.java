package se.fabricioflores.systemarchitecturelabone;

public abstract class BaseDiscount implements Discount {
    private final Discount nextDiscount;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public abstract boolean isApplicable(Product product);
    public abstract double calculateDiscount(Product product);

    public double apply(Product product) {
        double discountAmount = 0.0;

        if(isApplicable(product)) {
            discountAmount = calculateDiscount(product);
        }

        return discountAmount + nextDiscount.apply(product);
    }

    public String getDescription(Product product) {
        return nextDiscount.getDescription(product);
    }
}
