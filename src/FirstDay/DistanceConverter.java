package FirstDay;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a kilometer: ");
        double kilometer = sc.nextInt();

        System.out.println("inch: "+(kilometer*39370.1));  // kilometer to inches

        System.out.println("feet: "+(kilometer*3280.84));  // kilometer to foot

        System.out.println("yard: "+(kilometer*1093.61));  // kilometer to yard
    }
}
