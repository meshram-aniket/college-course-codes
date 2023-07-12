package NinethDay.Bank;

public class Bank {
//
    private int deposite;
    private int withdraw;

    private int balance = 0;

//    public void Balance(int Balance) {
//        this.balance = deposite - withdraw;
//    }

    public void setDeposite(int deposite) {
        this.deposite = deposite;
    }

    public int getDeposite() {
        this.balance += deposite;
        System.out.print("deposite amount: ");
        return balance;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        balance = balance - withdraw;
        System.out.print("withdraw amount: ");
        return withdraw;
    }

    public void totalAmount() {
        if (balance < 0) {
            System.out.println("insufficient balance");
        }
        else {
            System.out.println("total amount: "+balance);
        }
    }



}

