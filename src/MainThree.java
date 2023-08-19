public class MainThree {
  public static void main(String[] args) {
    for (int counter = 0; counter < 5; counter++) {
      System.out.println(counter);
      double amount = counter * 10000.00d;
      double interestRate = 0.20d;
      double interestT = calcInterest(amount, interestRate);
      System.out.println("Customer " + (counter + 1) + " is receiving and interest rate of " + interestT);
    }
  }

  public static double calcInterest(double amount, double interestRate) {
    double calculatedInterest = (amount * interestRate);
    System.out.println("The total interest would be: " + calculatedInterest);
    return calculatedInterest;
  }
}
