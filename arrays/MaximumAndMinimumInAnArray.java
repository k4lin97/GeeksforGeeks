package arrays;

public class MaximumAndMinimumInAnArray {

    static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    static Pair getMinMax(long a[], long n) {
        if (a == null || a.length == 0) {
            return null;
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (long i : a) {
            if (i <= min) {
                min = i;
            }
            if (i >= max) {
                max = i;
            }
        }
        return new Pair(min, max);
    }
}
