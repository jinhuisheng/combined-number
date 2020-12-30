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
    }

}
