package arrays;

import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer[]> listOfArrays = new ArrayList<>();

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arrLength = scanner.nextInt();
            scanner.nextLine();
            String[] stringValues = scanner.nextLine().split(" ");

            Integer[] arr = new Integer[arrLength];
            for (int j = 0; j < arrLength; j++) {
                arr[j] = Integer.parseInt(stringValues[j]);
            }
            listOfArrays.add(arr);
        }

        printReversesArray(listOfArrays);
    }

    private static void printReversesArray(List<Integer[]> listOfArrays) {
        if (listOfArrays == null || listOfArrays.isEmpty()) {
            return;
        }

        for (Integer[] listOfArray : listOfArrays) {
            for (int j = 0; j < listOfArray.length; j++) {
                System.out.print(listOfArray[listOfArray.length - 1 - j] + " ");
            }
        }
    }
}


//        import java.util.*;
//class GFG{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for(int z = 0; z <= t; z++) {
//            for(int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//            }
//
//            int k = n - 1;
//            for(int j = n; j != 0; j--) {
//                System.out.println(a[k]);
//                k = k-1;
//            }
//        }
//    }
//}