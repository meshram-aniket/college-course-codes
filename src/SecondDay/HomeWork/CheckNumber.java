package SecondDay.HomeWork;

import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("zero number");
        }

        else {
            String ans = (number < 0)? "negative number":"positive number";
            System.out.println(ans);
        }
    }
}
