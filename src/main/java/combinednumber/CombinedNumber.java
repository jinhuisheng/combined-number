package combinednumber;

import java.util.List;

public class CombinedNumber {
    private List<Integer> list;

    public CombinedNumber(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        if (list.size() == 2) {
            return list.get(1) + "" + list.get(0);
        }
        return list.get(0).toString();
    }
}
