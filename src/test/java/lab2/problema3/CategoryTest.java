import lab2.problema3.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {
    @Test
    void economicCategoryShouldReturnBasePrice() {
        Category strategy = new EconomicCategory();
        double result = strategy.getPriceCOP(1000);

        assertEquals(1000, result);
    }

    @Test
    void luxuryCategoryShouldIncreasePriceBy50Percent() {
        Category strategy = new LuxuryCategory();
        double result = strategy.getPriceCOP(1000);
        assertEquals(1500, result);
    }

    @Test
    void usedCategoryShouldReducePriceBy30Percent() {
        Category strategy = new UsedCategory();
        double result = strategy.getPriceCOP(1000);
        assertEquals(700, result);
    }

    @Test
    void luxuryCategoryShouldHaveHigherSpeed() {
        Category strategy = new LuxuryCategory();
        assertEquals(250, strategy.getMaxSpeed());
    }
}
