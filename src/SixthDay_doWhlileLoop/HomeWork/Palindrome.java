package SixthDay_doWhlileLoop.HomeWork;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int rev = reverse(num);

        if (isPalindrome(rev, num)) {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
    }

    public static boolean isPalindrome(int rev, int num) {
        if (rev == num) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int reverse(int num) {
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            count = (count * 10) + rem;
            num = num / 10;
        }
        return count;
    }
}

