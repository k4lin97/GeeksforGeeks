package arrays;

public class CountOfSmallerElements {
    public long countOfElements(long arr[], long n, long x) {
        long numOfElements = 0;
        for (long i : arr) {
            if (i <= x) {
                numOfElements++;
            }
        }
        return numOfElements;
    }
}
