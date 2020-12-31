package combinednumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinedNumberTest {
    @Test
    void should_generate_one_integer() {
        CombinedNumber combinedNumber = new CombinedNumber(Arrays.asList(1));
        assertThat(combinedNumber.toString()).isEqualTo("1");
    }

    @Test
    void should_generate_two_integer() {
        assertThat(new CombinedNumber(Arrays.asList(1, 2)).toString()).isEqualTo("21");
        assertThat(new CombinedNumber(Arrays.asList(10, 2)).toString()).isEqualTo("210");
    }

    @Test
    void should_generate_three_integer() {
        assertThat(new CombinedNumber(Arrays.asList(1, 2, 3)).toString()).isEqualTo("321");
        assertThat(new CombinedNumber(Arrays.asList(5, 50,56)).toString()).isEqualTo("56550");
        assertThat(new CombinedNumber(Arrays.asList(420, 42,423)).toString()).isEqualTo("42423420");
    }

    @Test
    void should_generate_four_integers() {
        assertThat(new CombinedNumber(Arrays.asList(50, 2, 1, 9)).toString()).isEqualTo("95021");
    }
}
