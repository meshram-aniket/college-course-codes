package seventhDay;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter an array" );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("the sum is: " +sum(arr));

    }

    public static int sum (int[] arrr) {
        int sum = 0;
        for (int i = 0; i < arrr.length; i++) {
            sum += arrr[i];
        }
        return sum;
    }
}
