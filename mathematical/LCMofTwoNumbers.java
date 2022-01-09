package mathematical;

public class LCMofTwoNumbers {
    private static Long[] lcmAndGcd(long a, long b) {
        return new Long[]{lcm(a, b), gcd(a, b)};
    }

    private static long lcm(long a, long b) {
        long lcm = Math.min(a, b);
        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }
        return lcm;
    }

    private static long gcd(long a, long b) {
        long gcd = Math.max(a, b);
        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) break;
            gcd--;
        }
        return gcd;
    }
}
