package lesson2;

public class Task2_1_1 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(false, false, false, false));//false
        System.out.println(booleanExpression(true, true, true, true));//false
        System.out.println(booleanExpression(false, false, true, true));//true
        System.out.println(booleanExpression(true, false, true, false));//true
        System.out.println(booleanExpression(true, true, false, false));//true
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a != b & c != d) || (a != c & b != d);
    }
}
