package combinednumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombinedNumber {
    private List<Integer> list;

    public CombinedNumber(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        List<Integer> combinedNumberList = getCombinedNumberList(list);
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList.get(0).toString();
    }

    private List<Integer> getCombinedNumberList(List<Integer> list) {
        if (list.size() < 3) {
            return getCombinedNumberListLessThanThree(list);
        }
        return getCombinedNumberListGreaterThanTwo(list);
    }

    private List<Integer> getCombinedNumberListGreaterThanTwo(List<Integer> list) {
        List<Integer> combinedNumberList = new ArrayList<>();
        for (int index = 0; index < list.size(); index++) {
            List<Integer> integers = getCombinedNumberList(remove(index, list));
            for (Integer integer : integers) {
                combinedNumberList.add(Integer.parseInt(list.get(index) + "" + integer));
            }
        }
        return combinedNumberList;
    }

    private List<Integer> remove(int index, List<Integer> list) {
        List<Integer> src = new ArrayList<>(list);
        src.remove(index);
        return src;
    }

    private List<Integer> getCombinedNumberListLessThanThree(List<Integer> list) {
        List<Integer> combinedNumberList = new ArrayList<>();
        combinedNumberList.add(combineNumber(list));
        Collections.reverse(list);
        combinedNumberList.add(combineNumber(list));
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList;
    }

    private int combineNumber(List<Integer> list) {
        return Integer.parseInt(list.stream()
                .mapToInt(Integer::intValue)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""))
        );
    }
}
