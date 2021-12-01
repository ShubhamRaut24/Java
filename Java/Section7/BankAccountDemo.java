package Java.Section7;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("john bought",5000);
        BankAccount bobsAccount = new BankAccount("Bob Merely");

        System.out.println(myAccount.getBalance()+" "+myAccount.getOwner());
        System.out.println(bobsAccount.getBalance()+" "+bobsAccount.getOwner());

        myAccount.deposit(4000);
        System.out.println(myAccount.getBalance()+" "+myAccount.getOwner());
        bobsAccount.deposit(7200);
        System.out.println(bobsAccount.getBalance()+" "+bobsAccount.getOwner());
        myAccount.withdraw(30000);


    }
}
