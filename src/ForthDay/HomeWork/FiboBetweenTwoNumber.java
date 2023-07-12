package ForthDay.HomeWork;

//print fibonacchi between two number
import java.util.Scanner;

public class FiboBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number: ");
        int s = sc.nextInt();
        System.out.println("enter end number: ");
        int e = sc.nextInt();
        // 0 1 1 2 3 5 8 13 21 34
        // 1 2 3 4 5 6 7 8  9  10
        int a = 0;
        int b = 1;
//        for (int i = 1; i <= e; i++) {
//            int fibo = a + b;
//            a = b;
//            b = fibo;
//            if (fibo >= s && fibo <= e) {
//                System.out.print(fibo+ " ");
//            }
//        }


//        while(s < e) {
//            int fibo = a + b;
//            b = fibo;
//            a = b;
//            if ()
//        }

//        int f = 0;
        for (int f = 0; f <= e+1;) {
            if (f >= s && f <= e) {
                System.out.println(f);
                f = f + s;
                f = s;
                s = f;
            }
        }
    }
}
