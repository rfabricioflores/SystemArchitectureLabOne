package se.fabricioflores.systemarchitecturelabone;

import java.time.LocalDateTime;

public class FridayDiscount extends BaseDiscount {

    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        var date = LocalDateTime.now();
        String day = String.valueOf(date.getDayOfWeek());

        return day.equals("FRIDAY");
    }

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.10;
    }

    @Override
    public String getDescription(Product product) {
        if(isApplicable(product)) return super.getDescription(product) +  " [🍺 Friday Discount 10%]";
        return super.getDescription(product);
    }
}
