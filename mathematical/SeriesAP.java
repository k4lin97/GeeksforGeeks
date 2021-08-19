package mathematical;

public class SeriesAP {
    private static int nthTermOfAP(int A1, int A2, int N) {
        int r = A2 - A1;
        return A1 + (N - 1) * r;
    }
}
