package se.fabricioflores.systemarchitecturelabone;

public class QuantityDiscount extends BaseDiscount {

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return product.getQuantity() >= 5;
    }

    @Override
    public double calculateDiscount(Product product) {
        return product.getQuantity() * 10;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product)) return super.getDescription(product) + " [🔢 Quantity discount, buy 5 or more and get 10kr off for each item]";
        return super.getDescription(product);
    }
}
