package dsu;

public class DSUUnionByRank extends DSU {

  protected int[] rank;

  public DSUUnionByRank(int n) {
    super(n);
  }

  @Override
  public void makeSet(int x) {
    parent[x] = x;
    if (rank == null) rank = new int[n];
    rank[x] = 0;
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
    if (rootX == rootY) return;

    operationCount++;
    if (rank[rootX] < rank[rootY]) {
      parent[rootX] = rootY;
    } else if (rank[rootX] > rank[rootY]) {
      parent[rootY] = rootX;
    } else {
      parent[rootY] = rootX;
      rank[rootX]++;
    }
  }

  @Override
  public String getName() {
    return "UnionByRank";
  }
}
