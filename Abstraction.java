package oops;

//Abstract class
abstract class BankAccount5 {
 String accountHolder;
 double balance;

 BankAccount5(String holder, double balance) {
     this.accountHolder = holder;
     this.balance = balance;
 }

 // Abstract method (must be implemented by child class)
 abstract void calculateInterest();

 // Concrete method (common to all accounts)
 void showBalance() {
     System.out.println(accountHolder + "'s Balance: " + balance);
 }
}

//Child class 1
class SavingsAccount5 extends BankAccount5 {
 double interestRate;

 SavingsAccount5(String holder, double balance, double rate) {
     super(holder, balance);
     this.interestRate = rate;
 }

 // Implement abstract method
 void calculateInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Savings Account Interest Added: " + interest);
 }
}

//Child class 2
class CurrentAccount5 extends BankAccount5 {
 double overdraftLimit;

 CurrentAccount5(String holder, double balance, double limit) {
     super(holder, balance);
     this.overdraftLimit = limit;
 }

 // Implement abstract method
 void calculateInterest() {
     System.out.println("Current Account: No Interest Applied");
 }

 void useOverdraft(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Overdraft used: " + amount);
     } else {
         System.out.println("Overdraft limit exceeded!");
     }
 }
}

//Main class
public class Abstraction {
 public static void main(String[] args) {
     BankAccount5 acc1 = new SavingsAccount5("Abbas", 5000, 5);
     acc1.showBalance();
     acc1.calculateInterest();
     acc1.showBalance();

     BankAccount5 acc2 = new CurrentAccount5("Ali", 3000, 2000);
     acc2.showBalance();
     acc2.calculateInterest();
     ((CurrentAccount5) acc2).useOverdraft(4000);
     acc2.showBalance();
 }
}

