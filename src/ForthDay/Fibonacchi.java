package ForthDay;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("0 1 ");
        for (int i = 0 ; i <= num-2 ; i++) {
            int fibo = a + b;
            a = b;
            b = fibo;
            System.out.print(fibo+" ");
        }
    }
}
