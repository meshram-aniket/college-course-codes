package SecondDay.HomeWork;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two digit number: ");
        int num = sc.nextInt();

        int sum = (num / 10) + (num % 10);
        int product = (num / 10) * (num % 10);

        String ans = ((sum + product) == num)? "Special two digit number": "not special two digit number";
        System.out.println(ans);
    }
}
