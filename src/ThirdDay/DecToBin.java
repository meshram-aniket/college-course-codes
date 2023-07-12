package ThirdDay;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println();
        int ans = 0;
        int count = 0;

        while(num != 0) {
        int remainder = num % 2;
            if (remainder != 0) {
                count = 1 + (count * 10);
                num = num / 2;
            }
            else {
                count = count * 10;
                num = num / 2;
            }
        }
         while (count != 0) {
             int remainder = count % 10;
             ans = (ans * 10) + remainder;
             count = count / 10;
         }

        System.out.println(ans);
    }
}
