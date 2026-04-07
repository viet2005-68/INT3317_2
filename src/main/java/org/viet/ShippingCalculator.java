package org.viet;

public class ShippingCalculator {
    public static double calculateFee(int d, double w) {
        if (d < 1 || d > 200 || w < 0.1 || w > 50) {
            return -1;
        }

        double  baseCost = 0, extraCost;
        if (d <= 10) {
            baseCost = 15000;
        } else {
            baseCost = 15000 + (d - 10) * 2000;
        }

        if(w <= 5) {
            extraCost = 0;
        }
        else if (w <= 20) {
            extraCost = 20000;
        } else {
            extraCost = 50000;
        }
        return baseCost + extraCost;
    }
}
