package lesson2;

public class Task2_1_4 {

    public static void main(String[] args) {
        int i = 233;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(flipBit(i, 32)));
    }

    public static int flipBit(int value, int bitIndex) {
        int bit = 1 << bitIndex - 1;
        return value ^ bit;
    }
}
