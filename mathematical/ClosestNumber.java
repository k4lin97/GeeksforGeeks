package mathematical;

public class ClosestNumber {
    private static int closestNumber(int n, int m) {
        int biggerInt = n;
        int smallerInt = n;

        while (true) {
            if (biggerInt % m == 0 && smallerInt % m != 0) {
                return biggerInt;
            }
            if (biggerInt % m != 0 && smallerInt % m == 0) {
                return smallerInt;
            }
            if (biggerInt % m == 0 && smallerInt % m == 0) {
                return Math.abs(biggerInt) > Math.abs(smallerInt) ? biggerInt : smallerInt;
            }
            biggerInt++;
            smallerInt--;
        }
    }
}
