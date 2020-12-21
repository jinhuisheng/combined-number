package combinednumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedNumber {
    private List<Integer> list;

    public CombinedNumber(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        if (list.size() < 3) {
            List<Integer> combinedNumberList = getIntegers(list);
            return combinedNumberList.get(0).toString();
        }
        List<Integer> combinedNumberList = getCombinedList(list);
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList.get(0).toString();
    }

    private List<Integer> getCombinedList(List<Integer> list) {
        if (list.size() < 3) {
            return getIntegers(list);
        }
        List<Integer> combinedNumberList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> integers = getCombinedList(remove(i));
            for (Integer integer : integers) {
                combinedNumberList.add(Integer.parseInt(list.get(i) + "" + integer));
            }
        }
        return combinedNumberList;
    }

    private List<Integer> remove(int index) {
        List<Integer> src = new ArrayList<>(list);
        src.remove(index);
        return src;
    }

    private List<Integer> getIntegers(List<Integer> list) {
        List<Integer> combinedNumberList = new ArrayList<>();
        combinedNumberList.add(combineNumber(list));
        Collections.reverse(list);
        combinedNumberList.add(combineNumber(list));
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList;
    }

    private int combineNumber(List<Integer> list) {
        return Integer.parseInt(
                list.stream()
                        .mapToInt(Integer::intValue).mapToObj(String::valueOf)
                        .collect(Collectors.joining("")));
    }
}
