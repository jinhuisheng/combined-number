package combinednumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateCombinedNumbersGenerator {
    public static List<Integer> generate(List<Integer> integers) {
        if (integers.size() == 1) {
            return integers;
        }
        if (integers.size() == 2) {
            return Arrays.asList(
                    Integer.parseInt(integers.get(0) + "" + integers.get(1)),
                    Integer.parseInt(integers.get(1) + "" + integers.get(0))
            );
        }
        List<Integer> candidates = new ArrayList<>();
        for (int index = 0; index < integers.size(); index++) {
            List<Integer> candidatesOfTheLeft = generate(dropAt(integers, index));
            for (Integer integer : candidatesOfTheLeft) {
                candidates.add(Integer.parseInt(integers.get(index) + "" + integer));
            }
        }
        return candidates;
    }

    private static List<Integer> dropAt(List<Integer> integers, int index) {
        List<Integer> temp = new ArrayList<>(integers);
        temp.remove(index);
        return temp;
    }
}
