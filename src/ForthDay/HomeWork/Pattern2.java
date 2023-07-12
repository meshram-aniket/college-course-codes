package ForthDay.HomeWork;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


// *************************************************************************

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//         14
//      23 24
//   32 33 34
//41 42 43 44