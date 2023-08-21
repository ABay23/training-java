package QuickFind;

public class QuickFind {

  private int[] id;

  public QuickFind(int N) {
    id = new int[N];

    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
    printArray();
  }

  public boolean areConnected(int p, int q) {
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int vap = id[p];
    int vaq = id[q];

    for (int i = 0; i < id.length - 1; i++) {
      if (id[i] == vap) {
        id[i] = vaq;
      }
    }
    printArray();
  }

  public void printArray() {
    // Print the contents of the id array
    for (int i = 0; i < id.length; i++) {
      System.out.print(id[i] + " ");
    }
    System.out.println(); // Print a newline after printing the array elements
  }
}