public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello Ale");

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It is not an alien!");
    }

    int topScore = 80;
    if (topScore <= 100) {
      System.out.println("You got the high score!");
    }

    int secondTopScore = 75;
    if (topScore > secondTopScore && topScore < 100) {
      System.out.println("Greater than second top score and less than 100");
    }

    // * you can write ternary operators in Java like in JS */
    String makeOfCar = "BMW";
    boolean isClassic = makeOfCar == "BMW" ? true : false;

    if (isClassic) {
      System.out.println("It's a Classic!");
    }

    int ageOfClient = 18;
    String ageText = ageOfClient >= 20 ? "Over Twenty!" : "Under Twenty!";
    System.out.println("Our Client is: " + ageText);
  }
}
