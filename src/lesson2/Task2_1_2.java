package lesson2;

public class Task2_1_2 {
    public static void main(String[] args) {
        System.out.println(leapYearCount(1));//0
        System.out.println(leapYearCount(4));//1
        System.out.println(leapYearCount(100));//24
        System.out.println(leapYearCount(401));//1
    }

    public static int leapYearCount(int year) {
        int result = 0;
        for (int i = 1; i <= year; i++ ){
            if (i % 400 == 0 ) {
                result++;
            } else if (i % 4 == 0 && i % 100 != 0 ) {
                result++;
            }
        }
        return result;
    }
}
