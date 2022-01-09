package mathematical;

public class GCDofTwoNumbers {
    private static int gcd(int a, int b) {
        int gcd = Math.max(a, b);
        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) break;
            gcd--;
        }
        return gcd;
    }
}
