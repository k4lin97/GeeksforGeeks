package arrays;

public class SecondLargestInArray {
    int print2largest(int arr[], int n) {
        int largest = -1;
        int secondLargest = -1;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i != largest && i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
