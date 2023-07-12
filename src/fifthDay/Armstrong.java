package fifthDay;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x : ");
        int x = sc.nextInt();
        int input = x;
        int arm = 0;
        while (x != 0){
            int rem = x % 10;
            arm += rem*rem*rem;
            x = x/10;
        }

        if (input == arm) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not armstrong");
        }


    }
}
