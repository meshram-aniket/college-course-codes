package EightDay;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfRowCol {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int[] arr: array) {
            System.out.println(Arrays.toString(arr));
        }

        Print(array);
    }

    public static void Print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("the sum of row " + i + " is: " + sum);
        }

        int[][] transpose = new int[4][3];                     // transpose
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        System.out.println();
        for (int i = 0; i < transpose.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < transpose[i].length; j++) {
                sum1 += transpose[i][j];
            }
            System.out.println("the sum of column " + i + " is: " + sum1);
        }
    }
}
