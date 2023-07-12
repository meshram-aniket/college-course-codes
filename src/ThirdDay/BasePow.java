package ThirdDay;

import java.util.Scanner;

public class BasePow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a number: ");
        int base = sc.nextInt();
        System.out.println("enter a number: ");
        int power = sc.nextInt();

        int ans = 1;
        for (int i = 1; i <= power; i++) {
           ans *= base;
        }
        System.out.println(ans);
    }
}
