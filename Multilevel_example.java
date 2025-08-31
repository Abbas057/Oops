package oops;

//Base class
class BankAccount2 {
 String accountHolder;
 double balance;

 BankAccount2(String holder, double balance) {
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

//Derived class (level 2)
class SavingsAccount2 extends BankAccount2 {
 double interestRate;

 SavingsAccount2(String holder, double balance, double rate) {
     super(holder, balance);
     this.interestRate = rate;
 }

 void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: " + interest + " | Balance: " + balance);
 }
}

//Derived from SavingsAccount (level 3)
class PremiumSavingsAccount extends SavingsAccount2 {
 double bonusRate;

 PremiumSavingsAccount(String holder, double balance, double rate, double bonus) {
     super(holder, balance, rate);
     this.bonusRate = bonus;
 }

 void addBonus() {
     double bonus = balance * bonusRate / 100;
     balance += bonus;
     System.out.println("Bonus added: " + bonus + " | Balance: " + balance);
 }
}

public class Multilevel_example {
 public static void main(String[] args) {
     PremiumSavingsAccount acc = new PremiumSavingsAccount("Abbas", 5000, 5, 2);

     acc.deposit(2000);
     acc.addInterest(); // from SavingsAccount
     acc.addBonus();    // from PremiumSavingsAccount
 }
}
