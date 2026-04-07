import org.junit.Test;
import org.viet.ShippingCalculator;

import static org.junit.Assert.assertEquals;

public class ShippingCalculatorAllUses {

    @Test
    public void test1() {
        // STT 1: 1 - 2 (T) - 3 - End -> Điều kiện trả về lỗi (ép d False để test p-use của w: d = 5, w = -1.0)
        assertEquals(-1, ShippingCalculator.calculateFee(5, -1.0), 0);
    }

    @Test
    public void test2() {
        // STT 2: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (T) - 9 - 13 -> d <= 10, w <= 5
        assertEquals(15000, ShippingCalculator.calculateFee(5, 2.0), 0);
    }

    @Test
    public void test3() {
        // STT 3: 1 - 2 (F) - 4 - 5 (F) - 7 - 8 (T) - 9 - 13 -> d > 10, w <= 5
        assertEquals(25000, ShippingCalculator.calculateFee(15, 3.0), 0);
    }

    @Test
    public void test4() {
        // STT 4: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (T) - 9 - 13 -> d <= 10, w <= 5
        // (Trùng path test 2 nhưng dùng input khác để cover đủ du-pair của biến w)
        assertEquals(15000, ShippingCalculator.calculateFee(8, 4.0), 0);
    }

    @Test
    public void test5() {
        // STT 5: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (F) - 10 (T) - 11 - 13 -> d <= 10, 5 < w <= 20
        assertEquals(35000, ShippingCalculator.calculateFee(8, 15.0), 0);
    }

    @Test
    public void test6() {
        // STT 6: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (F) - 10 (F) - 12 - 13 -> d <= 10, w > 20
        assertEquals(65000, ShippingCalculator.calculateFee(7, 40.0), 0);
    }
}