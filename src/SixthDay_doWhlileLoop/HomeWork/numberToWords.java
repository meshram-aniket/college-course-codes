package SixthDay_doWhlileLoop.HomeWork;

import java.util.Scanner;


public class numberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        // reverse the number
        while(num!= 0) {
            count = (count*10)+(num%10);
            num/=10;
        }

        while(count != 0) {
            int corr = count % 10;
            switch (corr) {
                case 0: {
                    System.out.print("ten ");
                    break;
                }

                case 1: {
                    System.out.print("one ");
                    break;
                }

                case 2: {
                    System.out.print("two ");
                    break;
                }

                case 3: {
                    System.out.print("three ");
                    break;
                }

                case 4: {
                    System.out.print("four ");
                    break;
                }

                case 5: {
                    System.out.print("five ");
                    break;
                }

                case 6: {
                    System.out.print("six ");
                    break;
                }

                case 7: {
                    System.out.print("seven ");
                    break;
                }

                case 8: {
                    System.out.print("eight ");
                    break;
                }

                case 9: {
                    System.out.print("nine ");
                    break;
                }
            }
            count = count / 10;
        }
    }
}
