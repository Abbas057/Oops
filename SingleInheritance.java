package oops;

// Parent class
class BankAccount1 {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount1(String name, int number, double balance) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Child class (Single Inheritance)
class SavingsAccount1 extends BankAccount1 {
    double interestRate;

    // Constructor calls parent constructor using super
    SavingsAccount1(String name, int number, double balance, double rate) {
        super(name, number, balance);  // calling parent constructor
        this.interestRate = rate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " | Balance: " + balance);
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Abbas", 101, 5000, 5);

        acc.deposit(2000);
        acc.withdraw(1000);
        acc.addInterest();  // child class method
    }
}

