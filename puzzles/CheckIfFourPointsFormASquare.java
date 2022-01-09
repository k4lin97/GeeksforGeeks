package puzzles;

import java.util.ArrayList;
import java.util.List;

public class CheckIfFourPointsFormASquare {
     private static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int distance2 = findSquareDistance(x1, y1, x2, y2);
        int distance3 = findSquareDistance(x1, y1, x3, y3);
        int distance4 = findSquareDistance(x1, y1, x4, y4);

        if (distance2 == 0 || distance3 == 0 || distance4 == 0) {
            return "No";
        }

        if (distance2 == distance3 && distance2 * 2 == distance4 &&
                findSquareDistance(x2, y2, x3, y3) * 2 == findSquareDistance(x3, y3, x4, y4)) {
            return "Yes";
        }

        if (distance3 == distance4 && 2 * distance3 == distance2
                && 2 * findSquareDistance(x2, y2, x3, y3) == findSquareDistance(x3, y3, x4, y4)) {
            return "Yes";
        }
        if (distance2 == distance4 && 2 * distance2 == distance3
                && 2 * findSquareDistance(x2, y2, x3, y3) == findSquareDistance(x2, y2, x4, y4)) {
            return "Yes";
        }

        return "No";
    }

    private static int findSquareDistance(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
