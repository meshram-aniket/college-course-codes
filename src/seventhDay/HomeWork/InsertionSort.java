package seventhDay.HomeWork;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8,7,5,2,9,3};
        System.out.println(Arrays.toString(array));
        System.out.println("the sorted array is: ");
        Sort(array);
    }

    public static void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j-1);
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
