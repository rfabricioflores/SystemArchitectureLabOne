package se.fabricioflores.systemarchitecturelabone.functional;

import se.fabricioflores.systemarchitecturelabone.Product;

import static org.assertj.core.api.Assertions.assertThat;
import static se.fabricioflores.systemarchitecturelabone.functional.Main.milkDiscount;
import static se.fabricioflores.systemarchitecturelabone.functional.Main.quantityDiscount;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMilkDiscountGivesFivePercentDiscount(){
        Product product = new Product("Milk", 15, 1);
        double milkDiscountAmount = milkDiscount.apply(product);
        double expectedDiscount = 15 * 0.05;
        assertThat(milkDiscountAmount).isEqualTo(expectedDiscount);
    }

    @Test
    void testQuantityDiscountWithQuantity4ShouldGiveZeroDiscount(){
        Product product = new Product("Mouse", 300, 4);
        double quantityDiscountAmount = quantityDiscount.apply(product);
        double expectedAmount = 0.0;
        assertThat(quantityDiscountAmount).isEqualTo(expectedAmount);
    }
}
