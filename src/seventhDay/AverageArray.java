package seventhDay;

import java.util.Arrays;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        System.out.println("enter an array" );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println();
        System.out.println("the average is: " +sumAvg(arr, n));

    }

    public static int sumAvg (double[] arrr, int n) {

        int avg = 0;
        for (int i = 0; i < arrr.length; i++) {
            avg += arrr[i];
        }
        return avg/arrr.length;
    }
}
