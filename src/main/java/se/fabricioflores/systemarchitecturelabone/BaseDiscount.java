package se.fabricioflores.systemarchitecturelabone;

public abstract class BaseDiscount implements Discount {
    private final Discount nextDiscount;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public abstract boolean isApplicable(Product product);
    public abstract double calculateDiscount(Product product);

    // Applicerar rabatten på produkten och returnerar rabattbeloppet
    public double apply(Product product) {
        double discountAmount = 0.0;

        if(isApplicable(product)) {
            discountAmount = calculateDiscount(product);
            product.setPrice(product.getPrice() - discountAmount);
        }

        return discountAmount + nextDiscount.apply(product);
    }

    // Returnerar beskrivning av rabatten som textsträng
    public String getDescription(Product product) {
        return nextDiscount.getDescription(product);
    }
}
