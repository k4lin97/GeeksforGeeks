package puzzles;

public class CheckForPower {
    private static Long isPowerOfAnother(Long x, Long y) {
        if (x == 1) {
            if (y == 1) {
                return 1L;
            } else {
                return 0L;
            }
        }
        int power = 0;
        while (true) {
            Long output = Math.round(Math.pow(x, power));
            if (output > y) {
                break;
            }

            if (output.equals(y)) {
                return 1L;
            }
            power++;
        }
        return 0L;
    }
}
