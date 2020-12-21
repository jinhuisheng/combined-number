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

    @Test
    void combine_list_with_two_item() {
        CombinedNumber combinedNumber = new CombinedNumber(Arrays.asList(1, 2));
        assertThat(combinedNumber.toString()).isEqualTo("21");
    }

    @Test
    void combine_list_with_three_item() {
        CombinedNumber combinedNumber = new CombinedNumber(Arrays.asList(1, 2, 3));
        assertThat(combinedNumber.toString()).isEqualTo("321");
    }

    @Test
    void combine_list_with_three_item_1() {
        CombinedNumber combinedNumber = new CombinedNumber(Arrays.asList(5, 50, 56));
        assertThat(combinedNumber.toString()).isEqualTo("56550");
    }



}
