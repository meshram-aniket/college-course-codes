package FirstDay;
import java.util.*;

public class YearMonWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a days: ");
        int days = sc.nextInt();
        int year = 0;
        int month = 0;
        int week = 0;

        year = days/365;  // calculate years
        days = days%365;

        month = days/30;  // calculate months
        days = days%30;

        week = days/7;    // calculate weeks
        days = days%7;    // remaining are days

        System.out.println(year+"Y: "+month+"M: "+week+"W: "+days+"D");
    }
}
