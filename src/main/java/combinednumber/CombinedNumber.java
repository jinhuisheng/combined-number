package combinednumber;

import java.util.List;

public class CombinedNumber {
    private List<Integer> integers;

    public CombinedNumber(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public String toString() {
        if (integers.size() < 2) {
            return integers.get(0).toString();
        }
        List<Integer> candidateCombinedNumbers = getCandidateCombinedNumbers();
        candidateCombinedNumbers.sort((x, y) -> y - x);
        return candidateCombinedNumbers.get(0).toString();
    }

    private List<Integer> getCandidateCombinedNumbers() {
        return CandidateCombinedNumbersGenerator.generate(integers);
    }
}
