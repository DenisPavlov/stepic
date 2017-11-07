package lesson2;

public class Task2_1_3 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        int d = (int) ((a + b) * 10000);
        int cc = (int) (c * 10000);

        return d == cc;
    }
}
