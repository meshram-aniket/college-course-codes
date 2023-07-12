package SecondDay;
import java.util.Scanner;

public class CompareAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = sc.nextInt();
        System.out.println("enter b: ");
        double b = sc.nextInt();

        double z = a/b;

        if (b > a) {
            z = b/a;
        }
        System.out.println(z);
    }
}
