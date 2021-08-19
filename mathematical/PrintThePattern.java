package mathematical;

public class PrintThePattern {
    private static void printPat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < n; k++) {
                    System.out.print(n - j + " ");
                }
            }
            System.out.print("$");
        }
    }
}
