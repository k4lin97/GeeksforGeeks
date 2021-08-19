package mathematical;

import java.util.ArrayList;
import java.util.List;

public class PrintTable {
    private static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(n * (i + 1));
        }
        return list;
    }
}
