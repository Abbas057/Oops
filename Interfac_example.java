package oops;

//Parent class
class BankAccount {
 String accountHolder;
 int accountNumber;
 double balance;

 BankAccount(String name, int number, double balance) {
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

//Interface 1
interface Interest {
 void addInterest();
}

//Interface 2
interface Loan {
 void applyLoan(double amount);
}

//Child class using Multiple Inheritance
class SavingsAccount extends BankAccount implements Interest, Loan {
 double interestRate;

 SavingsAccount(String name, int number, double balance, double rate) {
     super(name, number, balance);
     this.interestRate = rate;
 }

 // Implementing Interest interface
 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: " + interest + " | Balance: " + balance);
 }

 // Implementing Loan interface
 public void applyLoan(double amount) {
     balance += amount;
     System.out.println("Loan approved: " + amount + " | Balance: " + balance);
 }
}

//Main class
public class Interfac_example {
 public static void main(String[] args) {
     SavingsAccount acc = new SavingsAccount("Abbas", 101, 5000, 5);

     acc.deposit(2000);
     acc.withdraw(1000);
     acc.addInterest();     // from Interest interface
     acc.applyLoan(10000);  // from Loan interface
 }
}

