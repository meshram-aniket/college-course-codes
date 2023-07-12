package SecondDay;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = sc.nextInt();

        String ans = ((year % 400 != 0) && (year % 100 == 0 || year % 4 != 0))? "not leap year":"leap year";
        System.out.println(ans);
    }
}
