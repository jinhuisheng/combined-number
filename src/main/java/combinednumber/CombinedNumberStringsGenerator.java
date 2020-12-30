package combinednumber;

import java.util.ArrayList;
import java.util.List;

public class CombinedNumberStringsGenerator {
    public static List<String> generate(List<String> numberStrings) {
        if (numberStrings.size() == 1) {
            return numberStrings;
        }
        List<String> result = new ArrayList<>();
        for (int index = 0; index < numberStrings.size(); index++) {
            List<String> numberStringsOfTheLeft = generate(deleteAt(numberStrings, index));
            for (String numberString : numberStringsOfTheLeft) {
                result.add(numberStrings.get(index) + numberString);
            }
        }
        return result;
    }

    private static List<String> deleteAt(List<String> numberStrings, int index) {
        List<String> temp = new ArrayList<>(numberStrings);
        temp.remove(index);
        return temp;
    }
}
