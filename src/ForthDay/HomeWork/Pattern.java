package ForthDay.HomeWork;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();


        // 1st code
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
        System.out.println();
//*******************************************************************************

        // 2nd code
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
//************************************************************************************

        // 3rd code
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count % 10+" ");
                count += 1;
            }
            System.out.println();
        }
        System.out.println();


//**************************************************************
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= (num+1)-i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= (i*2)-2; j++) {
                System.out.print(" ");
            }
            for (int j = (num-i)+1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = num; i >= 1 ; i--) {
            for (int j = 1; j <= (num+1)-i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= (i*2)-2; j++) {
                System.out.print(" ");
            }
            for (int j = (num-i)+1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


