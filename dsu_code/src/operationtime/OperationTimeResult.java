package operationtime;

public class OperationTimeResult {

  public final String dsuName;
  public final int n;
  public final int m;
  public final long timeNanos;
  public final long operationCount;

  public OperationTimeResult(String dsuName, int n, int m, long timeNanos, long opCount) {
    this.dsuName = dsuName;
    this.n = n;
    this.m = m;
    this.timeNanos = timeNanos;
    this.operationCount = opCount;
  }

  @Override
  public String toString() {
    return String.format(
        "%-15s | n=%-8d | m=%-8d | tempo=%8.2f ms | ops=%d",
        dsuName, n, m, timeNanos / 1_000_000.0, operationCount);
  }
}
