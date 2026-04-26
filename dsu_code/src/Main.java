import dsu.DSUFullTarjan;
import dsu.DSUNaive;
import dsu.DSUUnionByRank;
import operationtime.*;

public class Main {

  public static void main(String[] args) {

    OperationTime operationTime = new OperationTime();

    int[][] configsOtimizados = {
      {1_000, 10_000},
      {10_000, 100_000},
      {50_000, 500_000},
      {100_000, 1_000_000},
      {1_000_000, 10_000_000},
      {5_000_000, 50_000_000},
    };
    int[][] configsNaive = {
      {1_000, 10_000},
      {10_000, 100_000},
      {50_000, 500_000},
    };

    System.out.println("=== Resultados Comparativos DSU ===\n");
    System.out.printf(
        "%-15s | %-10s | %-10s | %-15s | %s%n", "Variante", "n", "m", "Tempo (ms)", "Operações");
    System.out.println("-".repeat(75));

    System.out.println("=== Naive ===");
    for (int[] cfg : configsNaive) {
      OperationTimeResult r = operationTime.run(new DSUNaive(cfg[0]), cfg[0], cfg[1]);
      System.out.println(r);
    }

    System.out.println("\n=== UnionByRank e FullTarjan ===");
    for (int[] cfg : configsOtimizados) {
      OperationTimeResult r1 = operationTime.run(new DSUUnionByRank(cfg[0]), cfg[0], cfg[1]);
      OperationTimeResult r2 = operationTime.run(new DSUFullTarjan(cfg[0]), cfg[0], cfg[1]);
      System.out.println(r1);
      System.out.println(r2);
    }
  }
}
