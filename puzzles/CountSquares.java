package puzzles;

public class CountSquares {
    private static int countSquares(int n) {
        int counter = 0;
        int number = 1;
        while (Math.pow(number, 2) < n) {
            counter++;
            number++;
        }
        return counter;
    }
}
