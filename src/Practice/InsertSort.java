package Practice;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {4,6,3,5,9,2,1};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (array[j] < array[j - 1]) {
                    swap (array, j, j - 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int first, int last) {
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }
}
