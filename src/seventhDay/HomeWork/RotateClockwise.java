package seventhDay.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class RotateClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to rotate an array: ");
        int num = sc.nextInt();
        int[] array = {1, 2, 3, 4, 5};
        Rotate(array, num);

//        int[] a = {1,2,3,5};
//        int[] b = new int[4];
//        b[0] = 1;
//        b[1] = 2;
//
//        int[] c = new int[num];
    }

    public static void Rotate(int[] array, int num) {
        int first = 0;
        int last = array.length - 1;
        for (int i = first; i < num; i++) {
            int curr = array[last];           // 1 2 3 4 5
            for (int j = last; j > first; j--) {  // 0 1 2 3 4 - j
                swap(array, j - 1, j);
            }
            array[first] = curr;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int secondLast, int last) {
        int temp = array[secondLast];
        array[secondLast] = array[last];
        array[last] = temp;
    }
}
