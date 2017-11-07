package lesson2;

import java.util.Arrays;

public class Task2_4_2 {

    public static void main(String[] args) {
        int[] array1 = {0, 2, 2};
        int[] array2 = {0, 1, 2, 2, 3};

        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        if (a1 == null) return a2;
        if (a2 == null) return a1;

        int[] result = new int[a1.length + a2.length];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < result.length; i++ ) {

            if (index1 >= a1.length || index2 >= a2.length) {
                int index = index1 >= a1.length ? index2 : index1;
                int[] a = index1 >= a1.length ? a2 : a1;
                System.arraycopy(a, index, result, i, a.length- index );
                return result;
            }

            if (a1[index1] < a2[index2]) {
                result[i] = a1[index1++];
            } else if (a1[index1] > a2[index2]) {
                result[i] = a2[index2++];
            } else {
                result[i++] = a1[index1++];
                result[i] = a2[index2++];
            }
        }
        return result;
    }
}
