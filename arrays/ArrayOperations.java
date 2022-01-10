package arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] a = {1, 23, 5, 6,};
        System.out.println(a.length);
    }

    public boolean searchEle(int a[], int x) {
        if (a == null || a.length == 0) {
            return false;
        }
        return Arrays.stream(a)
                .anyMatch(i -> i == x);
    }

    public boolean insertEle(int a[], int y, int yi) {
        if (a == null || yi >= a.length || yi < 0) {
            return false;
        }
        a[yi] = y;
        return true;
    }

    public boolean deleteEle(int a[], int z) {
        if (a == null || a.length == 0) {
            return false;
        }

        int index = 0;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = index; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
        }

        return true;
    }
}
