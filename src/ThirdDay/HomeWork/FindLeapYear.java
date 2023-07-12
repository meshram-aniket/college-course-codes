package ThirdDay.HomeWork;
import java.util.*;
public class FindLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter from year: ");
        int FromYear = sc.nextInt();
        System.out.println("enter to Year: ");
        int toYear = sc.nextInt();

        for (int i = FromYear; i <= toYear ; i++) {
            if ((i % 400 == 0) || (i % 100 != 0 && i % 4 == 0)) {
                System.out.print(i+" ");
            }
        }
    }
}
