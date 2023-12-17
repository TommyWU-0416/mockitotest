package guide.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorWithValueSourceParameterizedTest {

    @ParameterizedTest()
    @ValueSource(ints = {2, 4, 6})
    void test1(int num) {
        Assertions.assertEquals(0, num % 2);
    }
}
