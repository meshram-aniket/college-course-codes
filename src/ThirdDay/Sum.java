package ThirdDay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num; i >= 0; i--) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
