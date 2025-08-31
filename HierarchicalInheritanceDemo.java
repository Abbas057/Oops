package oops;

// Base class
class BankAccount3 {
    String accountHolder;
    double balance;

    BankAccount3(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Child class 1
class SavingsAccount3 extends BankAccount3 {
    double interestRate;

    SavingsAccount3(String holder, double balance, double rate) {
        super(holder, balance);
        this.interestRate = rate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " | Balance: " + balance);
    }
}

// Child class 2
class CurrentAccount extends BankAccount3 {
    double overdraftLimit;

    CurrentAccount(String holder, double balance, double overdraft) {
        super(holder, balance);
        this.overdraftLimit = overdraft;
    }

    void useOverdraft(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Overdraft used: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        SavingsAccount3 sa = new SavingsAccount3("Abbas", 5000, 5);
        sa.deposit(1000);
        sa.addInterest();

        CurrentAccount ca = new CurrentAccount("Ali", 3000, 2000);
        ca.withdraw(3500);
        ca.useOverdraft(1000);
    }
}
