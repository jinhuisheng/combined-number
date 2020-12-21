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
        if (list.size() == 3) {
            List<Integer> combinedNumberList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                combinedNumberList.add(Integer.parseInt(list.get(i) + "" + getIntegers(remove(i)).get(0)));
                combinedNumberList.add(Integer.parseInt(list.get(i) + "" + getIntegers(remove(i)).get(1)));
            }
            combinedNumberList.sort((x, y) -> y - x);
            return combinedNumberList.get(0).toString();
        }
        if (list.size() == 2) {
            List<Integer> combinedNumberList = getIntegers(list);
            return combinedNumberList.get(0).toString();
        }
        return list.get(0).toString();
    }

    private List<Integer> remove(int index) {
        List<Integer> src = new ArrayList<>(list);
        src.remove(index);
        return src;
    }

    private List<Integer> getIntegers(List<Integer> list) {
        List<Integer> combinedNumberList = new ArrayList<>();
        combinedNumberList.add(Integer.parseInt(list.stream().mapToInt(Integer::intValue).mapToObj(String::valueOf).collect(Collectors.joining(""))));
        Collections.reverse(list);
        combinedNumberList.add(Integer.parseInt(list.get(0) + "" + list.get(1)));
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList;
    }
}
