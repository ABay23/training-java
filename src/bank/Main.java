package bank;

public class Main {

  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(
    // "1234", 50000.00d,
    // "Cachi", "curucho@gmail.com", "500-300-4552"
    );
    System.out.println(bankAccount.getCustomerName());
    System.out.println(bankAccount.getAccountBalance());
    // bankAccount.setAccountNumber("0025");
    // bankAccount.setAccountBalance(2300.30);
    // bankAccount.setCustomerName("Miranda");
    // bankAccount.setCustomerEmail("yanda@gmail.com");
    // bankAccount.setCustomerPhoneNumber("300-500-5555");

    // bankAccount.withdrawFunds();

    // bankAccount.showAccount();

    bankAccount.depositFunds();
  }

}
