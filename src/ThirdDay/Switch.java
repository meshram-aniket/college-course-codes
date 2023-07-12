package ThirdDay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the shape: ");
        String shape = sc.next();

        switch (shape) {
            case "square": {
                System.out.println("enter side: ");
                int side = sc.nextInt();
                System.out.println("area: " + (side * side));
                break;
            }

            case "triangle": {
                System.out.println("enter base: ");
                int base = sc.nextInt();
                System.out.println("enter height: ");
                int height = sc.nextInt();
                System.out.println("area: " + (0.5 * base * height));
                break;
            }

            case "circle": {
                System.out.println("enter radius: ");
                int radius = sc.nextInt();
                System.out.println("area: " + (3.14 * radius * radius));
                break;
            }

            default: {
                System.out.println("invalid shape");
            }
        }
    }
}
