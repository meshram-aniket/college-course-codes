package FirstDay;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius: ");
        double radius = sc.nextInt();

        System.out.print("enter a length: ");
        double length = sc.nextInt();

        double area = (3.14*radius*length)+(3.14*radius*radius);
        System.out.println("Total Surface Area: "+area);
    }
}
