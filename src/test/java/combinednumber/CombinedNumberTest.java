package combinednumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CombinedNumberTest {
    @Test
    void combine_list_with_one_item() {
        CombinedNumber combinedNumber = new CombinedNumber(Arrays.asList(1));
        assertThat(combinedNumber.toString()).isEqualTo("1");
    }
}
