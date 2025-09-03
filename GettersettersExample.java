package oops;
class Bank {
    private String accountHolder;  // private field
    private double balance;        // private field

    // Setter for accountHolder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {   // validation
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class Getter_setters_Example {
    public static void main(String[] args) {
        Bank acc = new Bank();

        // using setters
        acc.setAccountHolder("Abbas");
        acc.setBalance(5000);

        // using getters
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        // trying to set invalid balance
        acc.setBalance(-1000);
    }
}
