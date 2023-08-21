package bank;

import java.util.Scanner;

public class BankAccount {
  private String accountNumber = "0023";
  private double accountBalance = 0.00;
  private String customerName = "Peter";
  private String customerEmail = "pr@gmail.com";
  private String phoneNumber = "300-456-3443";

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;

  }

  public void setCustomerPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // * Deposit Funds into the Account */
  public void depositFunds() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the total deposit: ");
    String depositString = scanner.nextLine();
    double depositAmount = Double.parseDouble(depositString);

    scanner.close();
    if (depositAmount <= 0) {
      System.out.println("You need a positive amount!");
    } else {
      this.accountBalance = (accountBalance + depositAmount);
      System.out.println("This is the new balance in you account: " + accountBalance);
    }

  }

  // * Withdrawing Funds
  public void withdrawFunds() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the total withdrawal: ");
    String withdrawString = scanner.nextLine();
    double withdrawAmount = Double.parseDouble(withdrawString);

    scanner.close();
    if (withdrawAmount <= 0 || withdrawAmount > accountBalance) {
      System.out.println("Insufficient Funds! you only have " + accountBalance);
    } else {
      accountBalance = (accountBalance - withdrawAmount);
      System.out.println("This is the new balance in you account: " + accountBalance);

    }
  }

  // * Describe Account
  public void showAccount() {
    System.out.println("New account Number: " + accountNumber);
    System.out.println("With a balance: " + accountBalance);
    System.out.println("For customer: " + customerName);
    System.out.println("email: " + customerEmail);
    System.out.println("Phone Number: " + phoneNumber);

  }

  // public static void operationsX() {
  // Scanner scan = new Scanner(System.in);
  // System.out.println("What would you like to do, press W for withdrawal and D
  // for Deposit");
  // String operation = scan.nextLine();

  // if (operation == "W"){
  // withdrawFunds()
  // }

  // scan.close();
  // }
}
