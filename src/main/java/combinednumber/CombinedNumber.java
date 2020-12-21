package combinednumber;

import java.util.ArrayList;
import java.util.List;

public class CombinedNumber {
    private List<Integer> list;

    public CombinedNumber(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        if (list.size() == 3) {
            List<Integer> combinedNumberList = new ArrayList<>();
            combinedNumberList.add(Integer.parseInt(list.get(0) + "" + getIntegers(remove(0)).get(0)));
            combinedNumberList.add(Integer.parseInt(list.get(0) + "" + getIntegers(remove(0)).get(1)));
            combinedNumberList.add(Integer.parseInt(list.get(1) + "" + getIntegers(remove(1)).get(0)));
            combinedNumberList.add(Integer.parseInt(list.get(1) + "" + getIntegers(remove(1)).get(1)));
            combinedNumberList.add(Integer.parseInt(list.get(2) + "" + getIntegers(remove(2)).get(0)));
            combinedNumberList.add(Integer.parseInt(list.get(2) + "" + getIntegers(remove(2)).get(1)));
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
        combinedNumberList.add(Integer.parseInt(list.get(0) + "" + list.get(1)));
        combinedNumberList.add(Integer.parseInt(list.get(1) + "" + list.get(0)));
        combinedNumberList.sort((x, y) -> y - x);
        return combinedNumberList;
    }
}
