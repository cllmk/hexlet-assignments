package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> result1 = new ArrayList<Integer>();
        assertThat(App.take(result1, 2)).isEqualTo(new ArrayList<Integer>());

        List<Integer> result2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(App.take(result2, 2)).isEqualTo(Arrays.asList(1, 2));

        List<Integer> result3 = new ArrayList<>(Arrays.asList(7, 3, 10));
        assertThat(App.take(result3, 8)).isEqualTo(Arrays.asList(7, 3, 10));

        List<Integer> result4 = new ArrayList<>(Arrays.asList(7, 3, 10));
        assertThat(App.take(result4, 0)).isEqualTo(new ArrayList<Integer>());
        // END
    }
}
