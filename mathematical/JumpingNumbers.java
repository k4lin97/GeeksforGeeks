package mathematical;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JumpingNumbers {
    private static long jumpingNums(long x) {
        while (!isJumpingNumber(x)) {
            x--;
        }
        return x;
    }

    private static boolean isJumpingNumber(long x) {
        List<Integer> list = new LinkedList<>();
        while (x != 0) {
            int a = (int) x % 10;
            list.add(a);
            x /= 10;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i) - list.get(i + 1)) == 1) {
                return true;
            }
        }
        return false;
    }
}
