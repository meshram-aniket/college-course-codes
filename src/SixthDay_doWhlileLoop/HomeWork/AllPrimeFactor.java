package SixthDay_doWhlileLoop.HomeWork;

import java.util.Scanner;
//        2 | 36
//        2 | 18
//        2 | 9
//        3 | 3
//          | 1
public class AllPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int i = 2;

        while(num != 1) {
            if (num % i == 0) {
                System.out.print(i+" ");
                num = num / i;
            }
            else{
                i++;
            }
        }

    }
}
