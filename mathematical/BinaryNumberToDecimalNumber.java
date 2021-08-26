package mathematical;

public class BinaryNumberToDecimalNumber {
    private static int binaryToDecimal(String str) {
        int integerNumber = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            char myChar = str.charAt(str.length() - 1 - i);
            temp = Character.getNumericValue(myChar);
            integerNumber += temp * Math.pow(2, i);
        }
        return integerNumber;
    }
}
