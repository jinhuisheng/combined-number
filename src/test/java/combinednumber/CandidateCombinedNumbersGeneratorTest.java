package combinednumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateCombinedNumbersGeneratorTest {
    @Test
    void should_generate_one_integer() {
        assertThat(CandidateCombinedNumbersGenerator.generate(Arrays.asList(1))).isEqualTo(Arrays.asList(1));
    }

    @Test
    void should_generate_two_integers() {
        assertThat(CandidateCombinedNumbersGenerator.generate(Arrays.asList(1, 2))).isEqualTo(Arrays.asList(12, 21));
    }

    @Test
    void should_generate_three_integers() {
        assertThat(CandidateCombinedNumbersGenerator.generate(Arrays.asList(1, 2, 3))).isEqualTo(Arrays.asList(
                123,
                132,
                213,
                231,
                312,
                321
        ));
    }

    @Test
    void should_generate_four_integers() {
        List<Integer> candidates = CandidateCombinedNumbersGenerator.generate(Arrays.asList(1, 2, 3, 4));
        assertThat(candidates.size()).isEqualTo(24);
        assertThat(candidates.get(0)).isEqualTo(1234);
        assertThat(candidates.get(23)).isEqualTo(4321);
    }


}
