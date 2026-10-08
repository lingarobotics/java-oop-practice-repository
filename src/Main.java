
// For now, this main method is used to test the practice code written in the BankAccount class.
// In the future, this main method will be used to test code written in other practice classes.


public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Alice", 1000.0);
        BankAccount account2 = new BankAccount("Bob", 500.0);

        System.out.println(account1.getOwner() + "'s balance: $" + account1.getBalance());
        System.out.println(account2.getOwner() + "'s balance: $" + account2.getBalance());

        account1.deposit(200.0);
        account2.withdraw(100.0);

        System.out.println(account1.getOwner() + "'s balance after deposit: $" + account1.getBalance());
        System.out.println(account2.getOwner() + "'s balance after withdrawal: $" + account2.getBalance());
    }
}