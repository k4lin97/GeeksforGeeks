package puzzles;

import java.util.ArrayList;
import java.util.List;

public class ThreeDivisors {
    private static List<Integer> threeDivisors(List<Long> query, int q) {
        List<Integer> output = new ArrayList<>();
        int counter;

        for (int i = 0; i < q; i++) {
            counter = 0;
            for (int j = 0; j <= query.get(i); j++) {
                if (hasThreeDivisors(j)) {
                    counter++;
                }
            }
            output.add(counter);
        }

        return output;
    }

    private static boolean hasThreeDivisors(long number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
                if (counter > 3) {
                    return false;
                }
            }
        }
        return counter == 3;
    }
}
