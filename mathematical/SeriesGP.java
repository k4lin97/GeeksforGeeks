package mathematical;

public class SeriesGP {
    private static int Nth_term(int a, int r, int n) {
        int ans = (int) (a * Math.pow(r, n - 1));
        return ans % 1000000007;
    }
}
