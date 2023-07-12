package seventhDay.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write how many times you want to rotate: ");
        int n = sc.nextInt();
        char[] str = {'a','b','c','d','e'};
        Rotate(str, n);
    }

    public static void Rotate(char[] str, int n) {
        int first = 0;
        int last = str.length - 1;
        for (int i = 0; i < n; i++) {
            char curr = str[first];
            for (int j = 1; j < str.length; j++) {
                rotate(str, j, j-1);
                System.out.println(Arrays.toString(str));
            }
            str[last] = curr;
        }
    }

    public static void rotate(char[] arr, int last, int secondLast) {
        char temp = arr[last];
        arr[last] = arr[secondLast];
        arr[secondLast] = temp;
    }
}
