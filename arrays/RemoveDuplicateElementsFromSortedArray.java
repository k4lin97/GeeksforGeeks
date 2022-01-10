package arrays;

public class RemoveDuplicateElementsFromSortedArray {
    static int removeDuplicate(int A[], int N) {
        int[] tempArr = new int[A.length];
        tempArr[0] = A[0];
        int counter = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] != A[i]) {
                tempArr[counter] = A[i];
                counter++;
            }
        }

        if (counter >= 0) System.arraycopy(tempArr, 0, A, 0, counter);

        return counter;
    }
}
