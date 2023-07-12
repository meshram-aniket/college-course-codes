package fifthDay.Homework;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = sc.nextInt();

        System.out.println("enter y: ");
        int y = sc.nextInt();
        int rem = 1;
        while(rem != 0) {
                rem = x % y;

            if (rem == 0) {
                System.out.println(y);

            }
            else {
                x = y;
                y = rem;
            }


        }
    }
}
