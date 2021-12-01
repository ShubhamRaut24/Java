package Java.Section7;

public class BankAccount {

    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner,0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount)
    {
        if(amount > 0){
        balance += amount;
        }
        else {
            System.out.println("Amount must not be zero");
        }
    }
    public void withdraw(int amount)
    {
        if(amount <= balance && amount > 0){
        balance -= amount;
        }
        else {
            System.out.println("you don't have sufficient balance to withdraw Your balance is "+getBalance());
        }
    }
}
