package EightDay;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {10,7,8,2,11,4,15};
        int[] array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array1));

    }

//    public static int Max(int[] array) {
//
//    }

}
