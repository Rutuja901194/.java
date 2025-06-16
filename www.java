//Customer.java
public class Customer {
private String name;
private String address;
private String panCardNumber;
public Customer(String name, String address, String panCardNumber) {
this.name = name;
this.address = address;
this.panCardNumber = panCardNumber;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getPanCardNumber() {
return panCardNumber;
}
public void setPanCardNumber(String panCardNumber) {
this.panCardNumber = panCardNumber;
}
}

//Account.java
public class Account {
private int accountNumber;
private double balance;
private Customer customer;
public Account(int accountNumber, double balance, Customer customer) {
this.accountNumber = accountNumber;
this.balance = balance;
this.customer = customer;
}
public synchronized int getAccountNumber() {
return accountNumber;
}

public synchronized void setAccountNumber(int accountNumber) {
this.accountNumber = accountNumber;
}
public synchronized double getBalance() {
return balance;
}
public synchronized void setBalance(double balance) {
this.balance = balance;
}
public Customer getCustomer() {
return customer;
}
public void setCustomer(Customer customer) {
this.customer = customer;
}
public synchronized void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited " + amount + " to account number " +
accountNumber);
} else {
System.out.println("Invalid amount. Deposit failed.");
}
}
public synchronized void withdraw(double amount) {
if (amount > 0 && balance >= amount) {
balance -= amount;
System.out.println("Withdrew " + amount + " from account number " +
accountNumber);
} else {
System.out.println("Insufficient funds or invalid amount. Withdrawal
failed.");
}
}
}


//Transaction.java
public class Transaction {
public static void deposit(Account account, double amount) {
account.deposit(amount);
}
public static void withdraw(Account account, double amount) {
account.withdraw(amount);
}
}

//Loan.java
public class Loan {
private int loanId;
private String loanType;
private double loanAmount;
public Loan(int loanId, String loanType, double loanAmount) {
this.loanId = loanId;
this.loanType = loanType;
this.loanAmount = loanAmount;
}
public int getLoanId() {
return loanId;
}
public void setLoanId(int loanId) {
this.loanId = loanId;
}
public String getLoanType() {
return loanType;
}
public void setLoanType(String loanType) {
this.loanType = loanType;
}

public double getLoanAmount() {
return loanAmount;
}
public void setLoanAmount(double loanAmount) {
this.loanAmount = loanAmount;
}
}

//Bank.java
import java.util.ArrayList;
import java.util.List;
public class Bank {
private List<Account> accounts;
private List<Loan> loans;
public Bank() {
accounts = new ArrayList<>();
loans = new ArrayList<>();
}
public synchronized void addAccount(Account account) {
accounts.add(account);
}
public synchronized Account findAccountByNumber(int accountNumber) {
for (Account account : accounts) {
if (account.getAccountNumber() == accountNumber) {
return account;
}
}
return null;
}
public synchronized void displayAllAccounts() {
for (Account account : accounts) {
System.out.println("Account Number: " + account.getAccountNumber()
+ ", Balance: " + account.getBalance());
}

}
public synchronized void addLoan(Loan loan) {
loans.add(loan);
}
public synchronized void displayAllLoans() {
for (Loan loan : loans) {
System.out.println("Loan ID: " + loan.getLoanId() + ", Type: " +
loan.getLoanType() + ", Amount: " + loan.getLoanAmount());
}
}
}


//OnlineBankingSystem.java
import java.util.Scanner;
public class OnlineBankingSystem {
private static Scanner scanner = new Scanner(System.in);
private static Bank bank = new Bank();
public static void main(String[] args) {
// Example: Initialize accounts
Customer customer1 = new Customer("John Doe", "123 Elm Street",
"ABCDE1234F");
Customer customer2 = new Customer("Jane Smith", "456 Oak Avenue",
"FGHIJ5678K");
Account account1 = new Account(1001, 5000, customer1);
Account account2 = new Account(1002, 10000, customer2);
bank.addAccount(account1);
bank.addAccount(account2);
boolean exit = false;
while (!exit) {
System.out.println("Welcome to Online Banking System");
System.out.println("1. Display all account details");
System.out.println("2. Search by account number");

System.out.println("3. Deposit amount");
System.out.println("4. Withdraw amount");
System.out.println("5. Display all loan details");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
bank.displayAllAccounts();
break;
case 2:
System.out.print("Enter account number: ");
int accountNumber = scanner.nextInt();
Account account = bank.findAccountByNumber(accountNumber);
if (account != null) {
System.out.println("Account Number: " +
account.getAccountNumber() + ", Balance: " + account.getBalance());
} else {
System.out.println("Account not found.");
}
break;
case 3:
System.out.print("Enter account number: ");
accountNumber = scanner.nextInt();
account = bank.findAccountByNumber(accountNumber);
if (account != null) {
System.out.print("Enter amount to deposit: ");
double amount = scanner.nextDouble();
Transaction.deposit(account, amount);
} else {
System.out.println("Account not found.");
}
break;
case 4:
System.out.print("Enter account number: ");
accountNumber = scanner.nextInt();
account = bank.findAccountByNumber(accountNumber);
if (account != null) {
System.out.print("Enter amount to withdraw: ");
double amount = scanner.nextDouble();
Transaction.withdraw(account, amount);
} else {

System.out.println("Account not found.");
}
break;
case 5:
bank.displayAllLoans();
break;
case 6:
exit = true;
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please enter a number between
1 and 6.");
}
}
scanner.close();
}
}



//Multithreading Example
// To illustrate multithreading, let's simulate concurrent transactions using threads.
// Here's how you can extend the OnlineBankingSystem class to create multiple
// threads for deposit and withdrawal operations:

import java.util.Scanner;
public class OnlineBankingSystem {
private static Scanner scanner = new Scanner(System.in);
private static Bank bank = new Bank();
public static void main(String[] args) {
// Example: Initialize accounts
Customer customer1 = new Customer("John Doe", "123 Elm Street",
"ABCDE1234F");
Customer customer2 = new Customer("Jane Smith", "456 Oak Avenue",
"FGHIJ5678K");
Account account1 = new Account(1001, 5000, customer1);
Account account2 = new Account(1002, 10000, customer2);

bank.addAccount(account1);
bank.addAccount(account2);
boolean exit = false;
while (!exit) {
System.out.println("Welcome to Online Banking System");
System.out.println("1.Display");}
}
}
