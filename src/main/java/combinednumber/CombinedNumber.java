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
        if (list.size() == 2) {
            List<Integer> combinedNumberList = new ArrayList<>();
            combinedNumberList.add(Integer.parseInt(list.get(0) + "" + list.get(1)));
            combinedNumberList.add(Integer.parseInt(list.get(1) + "" + list.get(0)));
            combinedNumberList.sort((x, y) -> y - x);
            return combinedNumberList.get(0).toString();
        }
        return list.get(0).toString();
    }
}
