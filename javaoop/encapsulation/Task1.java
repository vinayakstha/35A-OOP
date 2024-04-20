package javaoop.encapsulation;

class BankAccount {
    private int accNumber;
    private String accHolderName;
    private float accBalance;

    BankAccount(int accNumber, String accHolderName, float accBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public void depositFunds(float accBalance) {
        this.accBalance += accBalance;
    }

    public void withdrawFunds(float accBalance) {
        this.accBalance -= accBalance;
    }

    public void getInfo() {
        System.out.println(this.accNumber + "," + this.accHolderName + "," + this.accBalance);
    }

}

public class Task1 {
    /*
     * 1. You are building a banking application that has a BankAccount class.
     * Implement the BankAccount class with encapsulation principles in mind.
     * Include private instance variables for the account number, account holder
     * name, and account balance. Provide public methods to allow clients to deposit
     * and withdraw funds, as well as access the account balance. Ensure that the
     * account balance cannot be accessed or modified directly.
     */
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1, "Vinayak", 100);
        b1.getInfo();
        b1.depositFunds(100);
        b1.getInfo();
        b1.withdrawFunds(20);
        b1.getInfo();
    }
}
