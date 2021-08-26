package mathematical;

public class PrintTheKthDigit {
    private static long kthDigit(int a, int b, int k) {
        long power = (long) Math.pow(a, b);
        long result = 0;
        for (int i = 0; i < k; i++) {
            result = power % 10;
            power /= 10;
        }
        return result;
    }
}
