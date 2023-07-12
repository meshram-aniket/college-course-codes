package SecondDay;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a salary: ");
        double salary = sc.nextInt();
        double bonus = 0;


        if (salary > 50000) {
           bonus = 25;
        }
        else {
            if (salary > 25000 && salary < 50000)
                bonus = 30;

            else
                bonus = 40;
        }
        System.out.println(salary+(salary*(bonus/100)));

    }
}
