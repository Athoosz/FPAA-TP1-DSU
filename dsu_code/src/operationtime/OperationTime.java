package operationtime;

import dsu.DSU;
import java.util.Random;

public class OperationTime {

  private final Random random = new Random(10);

  public OperationTimeResult run(DSU dsu, int n, int m) {
    dsu.resetOperationCount();

    for (int i = 0; i < Math.min(1000, m / 10); i++) {
      int a = random.nextInt(n);
      int b = random.nextInt(n);
      dsu.union(a, b);
    }

    dsu.resetOperationCount();

    long start = System.nanoTime();

    for (int i = 0; i < m; i++) {
      int a = random.nextInt(n);
      int b = random.nextInt(n);
      if (i % 3 == 0) {
        dsu.findSet(a);
      } else {
        dsu.union(a, b);
      }
    }

    long elapsed = System.nanoTime() - start;

    return new OperationTimeResult(dsu.getName(), n, m, elapsed, dsu.getOperationCount());
  }
}
