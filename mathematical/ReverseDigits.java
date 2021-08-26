package mathematical;

public class ReverseDigits {
    private static long reverseDigit(int n) {
        long reversedNumber = 0;
        while (n != 0) {
            reversedNumber *= 10;
            reversedNumber += n % 10;
            n /= 10;
        }
        return reversedNumber;
    }
}
