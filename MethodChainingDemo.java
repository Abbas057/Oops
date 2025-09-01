package oops;

class BankAcc {
    private double balance;

    // deposit method
    public BankAcc deposit(double amount) {
        balance += amount;
        return this; // returning current object
    }

    // withdraw method
    public BankAcc withdraw(double amount) {
        balance -= amount;
        return this; // returning current object
    }

    // show balance
    public BankAcc showBalance() {
        System.out.println("Balance: " + balance);
        return this; // still returning current object
    }
}

public class MethodChainingDemo {
    public static void main(String[] args) {
    	BankAcc acc = new BankAcc();

        // Method chaining: one line, multiple calls
        acc.deposit(1000)
           .withdraw(300)
           .deposit(200)
           .showBalance(); // final balance = 900
    }
}
