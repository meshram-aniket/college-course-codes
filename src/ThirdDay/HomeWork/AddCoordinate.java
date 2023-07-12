package ThirdDay.HomeWork;
import java.util.Scanner;

public class AddCoordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first polar coordinate (r1, θ1): ");
        double r1 = scanner.nextDouble();
        double theta1 = scanner.nextDouble();

        System.out.print("Enter the second polar coordinate (r2, θ2): ");
        double r2 = scanner.nextDouble();
        double theta2 = scanner.nextDouble();

        // Convert polar coordinates to Cartesian coordinates
        double x1 = r1 * Math.cos(theta1);
        double y1 = r1 * Math.sin(theta1);
        double x2 = r2 * Math.cos(theta2);
        double y2 = r2 * Math.sin(theta2);

        // Add the Cartesian coordinates
        double sumX = x1 + x2;
        double sumY = y1 + y2;

        // Convert the result back to polar coordinates
        double sumR = Math.sqrt((sumX * sumX )+ (sumY * sumY));
        double sumTheta = Math.atan2(sumY, sumX);

//        System.out.println("The sum of the polar coordinates is: (" + sumX + ", " + sumY + ")");
        System.out.println("The sum of the polar coordinates is: (" + sumR + ", " + sumTheta + ")");
    }
}

