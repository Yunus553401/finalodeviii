import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SayıÇevirme {

    private static String convertDecimalToBinary(BigDecimal decimalNumber) {
        BigInteger integralPart = decimalNumber.toBigInteger();
        BigDecimal fractionalPart = decimalNumber.subtract(new BigDecimal(integralPart));

        StringBuilder binaryIntegralPart = new StringBuilder();
        while (integralPart.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = integralPart.remainder(BigInteger.valueOf(2));
            binaryIntegralPart.insert(0, remainder.toString());
            integralPart = integralPart.divide(BigInteger.valueOf(2));
        }

        StringBuilder binaryFractionalPart = new StringBuilder(".");
        for (int i = 0; i < 10; i++) {
            fractionalPart = fractionalPart.multiply(BigDecimal.valueOf(2));
            BigInteger intPart = fractionalPart.toBigInteger();
            binaryFractionalPart.append(intPart.toString());
            fractionalPart = fractionalPart.subtract(new BigDecimal(intPart));
        }

        return binaryIntegralPart.toString() + binaryFractionalPart.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir ondalık sayı girin: ");
        BigDecimal decimalNumber = scanner.nextBigDecimal();
        scanner.close();

        String binaryNumber = convertDecimalToBinary(decimalNumber);

        System.out.println("Binary karşılığı: " + binaryNumber);
    }
}
