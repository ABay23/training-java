public class SecondClass {
  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    // if (score < 5000 && score > 1000) {
    // System.out.println("Your score was 5000");
    // } else if (score < 1000) {
    // System.out.println("Your Score was less than 1000");
    // } else {
    // System.out.println("Got there!");
    // }
    int finalScore = score;

    calculateScore(true, 700, levelCompleted, 100);

    int scoreX = calculateScore2(true, 850, levelCompleted, 100);

    System.out.println("Your final score X was " + scoreX);

    if (gameOver) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

  public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    // gameOver = true;
    // score = 700;
    // levelCompleted = 9;
    // bonus = 100;
    int finalScore = score;

    if (gameOver) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

  public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;

    if (gameOver) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
      // System.out.println("Your final score was " + finalScore);
    }
    return finalScore;
  }

}
