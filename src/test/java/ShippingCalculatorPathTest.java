import org.junit.Test;
import org.viet.ShippingCalculator;

import static org.junit.Assert.assertEquals;

/**
 * Kiểm thử theo đường đi (path) — bảng STT / đường đi / d, w / kết quả mong đợi.
 */
public class ShippingCalculatorPathTest {

    @Test
    public void test1() {
        // STT 1: 1 - 2 (T) - 3 - End — điều kiện lỗi phạm vi (vd. d > 200)
        assertEquals(-1, ShippingCalculator.calculateFee(250.0, 10.0), 0);
    }

    @Test
    public void test2() {
        // STT 2: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (T) - 9 - 13 — d ≤ 10, w ≤ 5
        assertEquals(15000, ShippingCalculator.calculateFee(5.0, 2.0), 0);
    }

    @Test
    public void test3() {
        // STT 3: 1 - 2 (F) - 4 - 5 (T) - 6 - 8 (F) - 10 (T) - 11 - 13 — d ≤ 10, 5 < w ≤ 20
        assertEquals(35000, ShippingCalculator.calculateFee(8.0, 12.0), 0);
    }

    @Test
    public void test4() {
        // STT 4: 1 - 2 (F) - 4 - 5 (F) - 7 - 8 (F) - 10 (F) - 12 - 13 — d > 10, w > 20
        assertEquals(75000, ShippingCalculator.calculateFee(15.0, 30.0), 0);
    }
}
