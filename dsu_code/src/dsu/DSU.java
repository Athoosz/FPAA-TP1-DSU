package dsu;

public abstract class DSU {

  protected int[] parent;
  protected int n;

  protected long operationCount;

  public DSU(int n) {
    this.n = n;
    this.parent = new int[n];
    this.operationCount = 0;
    for (int i = 0; i < n; i++) {
      makeSet(i);
    }
  }

  public abstract void makeSet(int x);

  public abstract int findSet(int x);

  public abstract void union(int x, int y);

  public boolean isItInTheSameSet(int x, int y) {
    return findSet(x) == findSet(y);
  }

  public long getOperationCount() {
    return operationCount;
  }

  public void resetOperationCount() {
    operationCount = 0;
  }

  public abstract String getName();
}
