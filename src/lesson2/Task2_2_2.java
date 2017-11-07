package lesson2;

public class Task2_2_2 {

    public static void main(String[] args) {
        int[] ints = new int[0];
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        int i = Integer.bitCount(value);
        return i == 1;
    }

}
