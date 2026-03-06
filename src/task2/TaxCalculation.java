package task2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation {
    public static void main(String[] args) {

        System.out.println("=== double ===");
        double netPriceDouble = 9.99;
        double vatRateDouble = 0.23;

        double grossPriceDouble = netPriceDouble * (1 + vatRateDouble);
        System.out.println("Gross price (double): " + grossPriceDouble);

        double totalGrossDouble = grossPriceDouble * 10000;
        System.out.println("Total gross x10,000 (double): " + totalGrossDouble);

        double totalNetDouble = totalGrossDouble / (1 + vatRateDouble);
        System.out.println("Net value back from gross (double): " + totalNetDouble);
        System.out.println("Expected: 99900.0 | Difference: " + (totalNetDouble - 99900.0));

        System.out.println("\n=== PART 2: BigDecimal ===");
        BigDecimal netPriceBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");
        BigDecimal grossPriceBD = netPriceBD.multiply(BigDecimal.ONE.add(vatRateBD));
        System.out.println("Gross price (BigDecimal): " + grossPriceBD);

        BigDecimal totalGrossBD = grossPriceBD.multiply(new BigDecimal("10000"));
        System.out.println("Total gross x10,000 (BigDecimal): " + totalGrossBD);

        BigDecimal totalNetBD = totalGrossBD.divide(
                BigDecimal.ONE.add(vatRateBD), 10, RoundingMode.HALF_UP
        );
        System.out.println("Net value back from gross (BigDecimal): " + totalNetBD);
        System.out.println("Difference: " + totalNetBD.subtract(new BigDecimal("99900.0")));

        System.out.println("\n=== CONCLUSIONS ===");
        System.out.println("double produces small rounding errors due to binary representation.");
        System.out.println("BigDecimal is precise - always use it for financial calculations.");
    }
}

