package SecondDay;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a amount: ");
        int money = sc.nextInt();

        int twoth = money/2000;
        money = money%2000;

        int fivehnd = money/500;
        money = money%500;

        int twohnd = money/200;
        money = money%200;

        int onehnd = money/100;
        money = money%100;

        int fifty = money/50;
        money = money%50;

        int twenty = money/20;
        money = money%20;

        int ten = money/10;
        money = money%10;

        int five = money/5;
//        money = money%5;

        System.out.println(twoth+" x Rs2000 = "+twohnd*2000);
        System.out.println(fivehnd+" x Rs500 = "+fivehnd*500);
        System.out.println(twohnd+" x Rs200 = "+twohnd*200);
        System.out.println(onehnd+" x Rs100 = "+onehnd*100);
        System.out.println(fifty+" x Rs50 = "+fifty*50);
        System.out.println(twenty+" x Rs20 = "+twenty*20);
        System.out.println(ten+" x Rs10 = "+ten*10);
        System.out.println(five+" x Rs5 = "+five*5);

    }
}
