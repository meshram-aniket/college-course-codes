package ForthDay.HomeWork;
import java.util.Scanner;
public class PrintEvenFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        // 0 1 1 2 3 5 8 13 21 34

        int f = 0;
        int s = 1;
        int fibo;
        for (int i = 1; i <= n * 3 ; i++) {  // since fibo number comes after every 3rd term thats why we take multiple of 3
            fibo = f + s;
            f = s;
            s = fibo;
            if (fibo % 2 == 0) {
                System.out.print(fibo+" ");
            }
        }
    }
}
