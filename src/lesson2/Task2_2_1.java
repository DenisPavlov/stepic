package lesson2;

public class Task2_2_1 {
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(32));
        System.out.println(charExpression(29));

        Character ch = new Character('d');
        char c = 'a';
        int i = 2;
        long l = 1L;
        byte b = 1;
        float f = 0.12f;

        i = c;
        ch = c;
    }
}
