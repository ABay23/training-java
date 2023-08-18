public class MainOne {
  public static void main(String[] args) {
    int newScore = calculateScores("Ale", 500);
    System.out.println("New score is " + newScore);
    calculateScores(400);
  }

  public static int calculateScores(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScores(int score) {
    System.out.println("Unnamed Player scored " + score + " points");
    return score * 1000;
  }
}
