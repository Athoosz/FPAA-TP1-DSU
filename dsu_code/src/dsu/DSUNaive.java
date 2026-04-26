package dsu;

public class DSUNaive extends DSU {

  public DSUNaive(int n) {
    super(n);
  }

  @Override
  public void makeSet(int x) {
    parent[x] = x;
    operationCount++;
  }

  @Override
  public int findSet(int x) {
    while (parent[x] != x) {
      operationCount++;
      x = parent[x];
    }
    operationCount++;
    return x;
  }

  @Override
  public void union(int x, int y) {
    int rootX = findSet(x);
    int rootY = findSet(y);
    if (rootX != rootY) {
      parent[rootY] = rootX;
      operationCount++;
    }
  }

  @Override
  public String getName() {
    return "Naive";
  }
}
