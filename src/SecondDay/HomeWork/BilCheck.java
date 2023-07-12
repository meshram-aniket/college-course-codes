package SecondDay.HomeWork;

import java.util.Scanner;

public class BilCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc.next();
        System.out.print("enter unit: ");
        int unit = sc.nextInt();
        double bil;
        double amount;
        double GST = 0.18;   // GST is 18%
        double surcharge = 0.05;   // surcharge is 5%


        if (unit <= 100) {
            bil = unit * 4;
        }
        else {
            if (unit <= 200) {
                bil = (100 * 4) + (unit - 100) * 5;
            }
            else {
                bil = (100 * 4) + (200 * 5) + (unit - 300) * 10;
            }
        }
        amount = bil + (bil * (GST));

        if (amount > 1000) {
            amount = amount + ((surcharge) * amount);
        }

        System.out.println("name = "+ name);
        System.out.println("unit = "+ unit);
        System.out.println("amount = "+ amount);
    }
}
