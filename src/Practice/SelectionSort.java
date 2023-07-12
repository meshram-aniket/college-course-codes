package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6,5,4,3,8,1,2};
        sort(array);
    }

    public static void sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int max = maxInd(array, 0, last);
            swap(array, max, last);
        }
        System.out.println(Arrays.toString(array));
    }


    public static void swap (int[] array, int mxIndex, int last) {
        int temp = array[last];
        array[last] = array[mxIndex];
        array[mxIndex] = temp;
    }
    public static int maxInd (int[] array, int max, int last) {
        for (int i = 0; i < last; i++) {
            for (int j = 0; j < last; j++) {
                if (array[max] < array[j+1]) {
                    int temp = array[max];
                    array[max] = array[j + 1];
                    array[j+1] = temp;
                }
            }

        }
        return max;
    }
}