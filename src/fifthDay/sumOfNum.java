package fifthDay;

import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();


        // to count the sum of number
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("sum is " +sum);
        System.out.println();
        System.out.println();




        // to reverse the number
        System.out.println("enter m: ");
        int m = sc.nextInt();


        int rev = 0;
        while(m != 0) {
            int remainder = m % 10;
            rev = (rev * 10) + remainder;
            m = m / 10;
        }
        System.out.println("reverse number is : "+rev);
    }
}
