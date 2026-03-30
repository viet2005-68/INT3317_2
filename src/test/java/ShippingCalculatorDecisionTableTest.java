import org.junit.Test;
import org.viet.ShippingCalculator;

import static org.junit.Assert.assertEquals;

public class ShippingCalculatorDecisionTableTest {
    @Test
    public void testDT_R1_ErrorWeight() {
        // Rule 1: d <= 10, w > 50 -> Lỗi (-1)
        assertEquals(-1, ShippingCalculator.calculateFee(5, 60.0),0);
    }

    @Test
    public void testDT_R2_ShortHeavy() {
        // Rule 2: d <= 10, 20 < w <= 50
        assertEquals(65000, ShippingCalculator.calculateFee(8, 30.0),0);
    }

    @Test
    public void testDT_R3_ShortMedium() {
        // Rule 3: d <= 10, 5 < w <= 20
        assertEquals(35000, ShippingCalculator.calculateFee(6, 15.0),0);
    }

    @Test
    public void testDT_R4_ShortLight() {
        // Rule 4: d <= 10, 0.1 <= w <= 5
        assertEquals(15000, ShippingCalculator.calculateFee(5, 3.0),0);
    }

    @Test
    public void testDT_R5_ErrorDistance() {
        // Rule 5: d > 200, d > 10 -> Lỗi (-1)
        assertEquals(-1, ShippingCalculator.calculateFee(250, 10.0),0);
    }

    @Test
    public void testDT_R6_FarHeavy() {
        // Rule 6: d > 10, 20 < w <= 50
        assertEquals(75000, ShippingCalculator.calculateFee(15, 25.0),0);
    }

    @Test
    public void testDT_R7_FarMedium() {
        // Rule 7: d > 10, 5 < w <= 20
        assertEquals(55000, ShippingCalculator.calculateFee(20, 10.0),0);
    }

    @Test
    public void testDT_R8_FarLight() {
        // Rule 8: d > 10, 0.1 <= w <= 5
        assertEquals(19000, ShippingCalculator.calculateFee(12, 4.0),0);
    }
}
