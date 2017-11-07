package lesson2;

import java.math.BigInteger;

public class Task2_4_1 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= value; i++ ) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
