import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.viet.ShippingCalculator;
public class ShippingCalculatorBoundaryTest {

    @Test
    public void test1_NomNom() {
        assertEquals(245000, ShippingCalculator.calculateFee(100, 25.0),0);
    }

    @Test
    public void test2_MinNom() {
        assertEquals(65000, ShippingCalculator.calculateFee(1, 25.0),0);
    }

    @Test
    public void test3_MinPlusNom() {
        assertEquals(65000, ShippingCalculator.calculateFee(2, 25.0),0);
    }

    @Test
    public void test4_MaxMinusNom() {
        assertEquals(443000, ShippingCalculator.calculateFee(199, 25.0),0);
    }

    @Test
    public void test5_MaxNom() {
        assertEquals(445000, ShippingCalculator.calculateFee(200, 25.0),0);
    }

    @Test
    public void test6_NomMin() {
        assertEquals(195000, ShippingCalculator.calculateFee(100, 0.1),0);
    }

    @Test
    public void test7_NomMinPlus() {
        assertEquals(195000, ShippingCalculator.calculateFee(100, 0.2),0);
    }

    @Test
    public void test8_NomMaxMinus() {
        assertEquals(245000, ShippingCalculator.calculateFee(100, 49.9),0);
    }

    @Test
    public void test9_NomMax() {
        assertEquals(245000, ShippingCalculator.calculateFee(100, 50.0),0);
    }
}