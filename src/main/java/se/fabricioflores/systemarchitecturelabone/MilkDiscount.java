package se.fabricioflores.systemarchitecturelabone;

public class MilkDiscount extends BaseDiscount {

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return product.getName().equalsIgnoreCase("MILK");
    }

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.05;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product)) return super.getDescription(product) + " [🥛 Milk Discount 5%]";
        return super.getDescription(product);
    }
}
