package dsu;

public class DSUFullTarjan extends DSUUnionByRank {

  public DSUFullTarjan(int n) {
    super(n);
  }

  @Override
  public int findSet(int x) {
    operationCount++;
    if (parent[x] != x) {
      parent[x] = findSet(parent[x]);
    }
    return parent[x];
  }

  @Override
  public String getName() {
    return "FullTarjan";
  }
}
