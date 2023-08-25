package Constructors;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Nate", 3000, "curucho@gmail.com");

    System.out.println(customer.getCustomerName());
    System.out.println(customer.getCreditLimit());
    System.out.println(customer.getCustomerEmail());

    Customer customerTwo = new Customer();

    System.out.println(customerTwo.getCustomerName());
    System.out.println(customerTwo.getCreditLimit());
    System.out.println(customerTwo.getCustomerEmail());

    Customer customerThree = new Customer("Pichi", "pichi@gmail.com");

    System.out.println(customerThree.getCustomerName());
    System.out.println(customerThree.getCreditLimit());
    System.out.println(customerThree.getCustomerEmail());

  }

}
