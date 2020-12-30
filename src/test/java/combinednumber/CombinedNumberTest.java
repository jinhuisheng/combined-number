package combinednumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinedNumberTest {
    @Test
    void should_combine_one_number() {
        assertThat(CombinedNumber.toString(Arrays.asList("1"))).isEqualTo("1");
    }

    @Test
    void should_combine_two_number() {
        assertThat(CombinedNumber.toString(Arrays.asList("1", "2"))).isEqualTo("21");
        assertThat(CombinedNumber.toString(Arrays.asList("2", "1"))).isEqualTo("21");
        assertThat(CombinedNumber.toString(Arrays.asList("10", "2"))).isEqualTo("210");
    }

    @Test
    void should_combine_three_number() {
        assertThat(CombinedNumber.toString(Arrays.asList("1", "2", "3"))).isEqualTo("321");
        assertThat(CombinedNumber.toString(Arrays.asList("50", "2", "1", "9"))).isEqualTo("95021");
        assertThat(CombinedNumber.toString(Arrays.asList("5", "50", "56"))).isEqualTo("56550");
        assertThat(CombinedNumber.toString(Arrays.asList("420", "42", "423"))).isEqualTo("42423420");
    }

}
