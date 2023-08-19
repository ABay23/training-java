public class challengeTwo {
  public static void main(String[] args) {

    isPalindrome(-222);
  }

  public static boolean isPalindrome(int number) {
    int lastDigit = 0;
    int reverse = 0;

    int nx = number;
    boolean isNegative = nx < 0 ? true : false;

    if (isNegative) {
      nx = nx * -1;
      number = number * -1;

    }

    while (nx != 0) {

      lastDigit = nx % 10;
      System.out.println("Last Digit " + lastDigit);
      reverse = (reverse * 10) + lastDigit;
      nx = nx / 10;
      System.out.println(reverse);
      System.out.println(nx);

    }
    if (number == reverse) {
      System.out.println("true");
      return true;
    } else {
      System.out.println("false");

      return false;
    }
  }
}
