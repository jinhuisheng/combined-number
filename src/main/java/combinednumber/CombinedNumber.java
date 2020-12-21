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
            return list.get(1) + "" + list.get(0);
        }
        return list.get(0).toString();
    }
}
