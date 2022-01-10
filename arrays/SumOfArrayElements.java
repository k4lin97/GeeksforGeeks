package arrays;

public class SumOfArrayElements {
    public static int sumElement(int arr[], int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
