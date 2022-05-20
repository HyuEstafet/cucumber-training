package helpers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculatorHelper {

    public int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public float sumOfFloats(float a, float b) {
        return a + b;
    }

    public double sumOfDoubles(double a, double b) {
        return a + b;
    }

    public BigInteger sumOfBigIntegers(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public BigDecimal sumOfBigDecimals(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

}
