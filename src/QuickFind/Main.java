package QuickFind;

public class Main {

  public static void main(String[] args) {
    QuickFind quickFind = new QuickFind(10);

    quickFind.union(4, 3);
    quickFind.union(3, 8);
    quickFind.union(6, 5);
    quickFind.union(9, 4);
    quickFind.union(2, 1);
    quickFind.union(5, 0);
    quickFind.union(7, 2);
    quickFind.union(6, 1);
    quickFind.union(1, 0);

  }

  // private int[] id;

  // public QuickFind(int N) {
  // id = new int[N];

  // for (int i = 0; i < N; i++) {
  // id[i] = i;
  // }
  // System.out.println(id);
  // }

}
