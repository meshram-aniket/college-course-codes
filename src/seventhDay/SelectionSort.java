package seventhDay;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 10, 7, 9, 6, 2, 4};

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
                int temp = arr[max];
                arr[max] = arr[arr.length - 1- i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
