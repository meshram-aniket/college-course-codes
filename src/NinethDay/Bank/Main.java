package NinethDay.Bank;

public class Main {
    public static void main(String[] args) {
        accountNo b = new accountNo(13234233);
        b.totalAmount();
        b.setDeposite(35666);
        System.out.println(b.getDeposite());
        b.setWithdraw(4000);
        System.out.println(b.getWithdraw());
        b.totalAmount();
        System.out.println();

        accountNo b1 = new accountNo(236362637);
        b1.setDeposite(100000);
        System.out.println(b1.getDeposite());
        b1.setWithdraw(40000);
        System.out.println(b1.getWithdraw());
        b1.totalAmount();
        System.out.println();

        accountNo b2 = new accountNo(366266277);
        b2.setDeposite(4556);
        System.out.println(b2.getDeposite());
        b2.setWithdraw(451);
        System.out.println(b2.getWithdraw());
        b2.totalAmount();
    }
}
