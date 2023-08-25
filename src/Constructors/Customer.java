package Constructors;

public class Customer {
  private String customerName;
  private double creditLimit;
  private String customerEmail;

  public String getCustomerName() {
    return customerName;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public Customer() {
    this("Talula", "talu@gmail.com");
  }

  public Customer(String customerName, String customerEmail) {

    this(customerName, 6000, customerEmail);
  }

  public Customer(String customerName, double creditLimit, String customerEmail) {
    this.customerName = customerName;
    this.creditLimit = creditLimit;
    this.customerEmail = customerEmail;
  }

  // public Customer(String "Maria", "amria@gmail.com") {
  // this();
  // }

}
