package seventhDay.HomeWork;

import java.util.Arrays;

public class DivideAndSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 8, 7, 5, 3};
        Sort(array);
    }

    public static void Sort(int[] array) {
        int mid = array.length / 2;
        int i = 0;
        int j = mid + 1;
        while(i < mid && j < array.length) {
            swap (array, i, j);
            i++;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
