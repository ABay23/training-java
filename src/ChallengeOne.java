public class ChallengeOne {
  public static void main(String[] args) {
    double two = 20.00d;
    double twoTwo = 80.00d;

    double added = (two + twoTwo) * 100.00d;
    System.out.println("My total added is: " + added);
    double rem = added % 40.00d;
    System.out.println("The reminder is: " + rem);

    boolean remix = rem == 0.00 ? true : false;
    System.out.println("The reminder is: " + remix);

    if (!remix) {
      System.out.println("Got some Reminder: " + remix);
    }
  }
}
