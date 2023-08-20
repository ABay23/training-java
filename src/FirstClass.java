import java.util.Scanner;

public class FirstClass {
  public static void main(String[] args) {
    // System.out.print("Hello World");

    // int currentYear = 2022;
    // String usersDateOfBirth = "1999";

    // int dateOfBirth = Integer.parseInt(usersDateOfBirth);

    // System.out.println("Age = " + (currentYear - dateOfBirth));

    // String usersAgeWithPartialYear = "22.5";
    // double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
    // System.out.println("The User says he's " + ageWithPartialYear);

    int currentYear = 2022;
    try {
      System.out.println(getInputFromConsole(currentYear));

    } catch (Exception e) {
      //
      System.out.println(getInputFromScanner(currentYear));
    }

  }

  public static String getInputFromConsole(int currentYear) {

    String name = System.console().readLine("Hi what is your name? ");
    System.out.println("Hi " + name + ", Thanks for taking the course!");

    String dateOfBirth = System.console().readLine("What year where you born? ");

    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So you are " + age + "years old";

  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);

    // String name = System.console().readLine("Hi what is your name? ");
    System.out.println("Hi wath's your name? ");
    String name = scanner.nextLine();
    System.out.println("Hi " + name + ", Thanks for taking the course!");

    // String dateOfBirth = System.console().readLine("What year where you born? ");
    System.out.println("What year where you born? ");
    String dateOfBirth = scanner.nextLine();

    int age = currentYear - Integer.parseInt(dateOfBirth);

    scanner.close();
    return "So you are " + age + "years old";
  }

  public static int checkData(int currentYear, String dateOfBirth) {
    int dob = Integer.parseInt(dateOfBirth);
    int minimumYear = currentYear - 120;
    if ((dob < minimumYear) || (dob > currentYear)) {
      return -1;
    }
    return (currentYear - dob);
  }
}
