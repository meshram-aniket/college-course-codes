package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {13,26,31,35,10};
        Sort(array);
    }

    public static void Sort (int[] array){

        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array.length - 1- i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
