package combinednumber;

import java.util.Comparator;
import java.util.List;

public class CombinedNumber {

    public static String toString(List<String> numbers) {
        List<String> combinedNumberStrings = getCombinedNumberStrings(numbers);
        return getLargestNumberString(combinedNumberStrings);
    }

    private static String getLargestNumberString(List<String> combinedNumberStrings) {
        return combinedNumberStrings.stream()
                .map(Integer::parseInt)
                .max(Comparator.comparingInt(x -> x))
                .get()
                .toString();
    }

    private static List<String> getCombinedNumberStrings(List<String> numbers) {
        return CombinedNumberStringsGenerator.generate(numbers);
    }
}

