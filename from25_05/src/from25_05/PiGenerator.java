package from25_05;

import java.math.BigDecimal;

public class PiGenerator {
    public static void main(String[] args) {
        BigDecimal pi = BigDecimal.ZERO;
        BigDecimal term = BigDecimal.ONE;
        BigDecimal divisor = BigDecimal.ONE;

        int sign = 1;
        int iterations = 0;

        while (true) {
            pi = pi.add(term);
            divisor = divisor.add(BigDecimal.valueOf(2));
            term = term.divide(divisor, 1000, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(sign));

            sign = -sign;
            iterations++;

            // Печать значения числа π каждые 10000 итераций
            if (iterations % 10000 == 0) {
                System.out.println("Iterations: " + iterations);
                System.out.println("Pi: " + pi.multiply(BigDecimal.valueOf(4)));
                System.out.println();
            }
        }
    }
}
