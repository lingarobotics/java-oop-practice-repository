// This program was written for practicing one of the object-oriented programming concepts - encapsulation.
// The BankAccount class encapsulates the details of a bank account, including the owner's name and the account balance.
// It provides methods to deposit and withdraw funds, while ensuring that the balance cannot go negative.


public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= this.balance) {
            this.balance -= withdrawAmount;
        } else {
            System.out.println("Invalid withdrawal or insufficient funds");
        }
    }
}