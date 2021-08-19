package mathematical;

public class ArmstrongNumbers {
    private static String armstrongNumber(int n) {
        int orgNum = n;
        int digitSum = 0;
        while (n != 0) {
            digitSum += Math.pow((n % 10), 3);
            n /= 10;
        }
        if (orgNum == digitSum) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
