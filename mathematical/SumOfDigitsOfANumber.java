package mathematical;

public class SumOfDigitsOfANumber {
    private static int isDigitSumPalindrome(int n) {
        int sumOfDigits = sumOfDigits(n);
        return isPalindrome(sumOfDigits) ? 1 : 0;
    }

    private static int sumOfDigits(int n) {
        int sumOfDigits = 0;
        while (n != 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }
        return sumOfDigits;
    }

    private static boolean isPalindrome(int n) {
        int reverseNum = 0;
        int orgNum = n;

        while (n != 0) {
            reverseNum *= 10;
            reverseNum += n % 10;
            n /= 10;
        }

        return orgNum == reverseNum;
    }
}
