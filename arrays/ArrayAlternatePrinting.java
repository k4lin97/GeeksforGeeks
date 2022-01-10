package arrays;

public class ArrayAlternatePrinting {
    public static void print(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
