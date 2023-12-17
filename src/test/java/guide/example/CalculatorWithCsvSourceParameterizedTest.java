package guide.example;

import com.example.guide.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCsvSourceParameterizedTest {

    @ParameterizedTest()
    @CsvSource({"0, 1, 1", "10, 20, 30"})
    void test1(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second), () -> first + " + " + second + " should equal " + expectedResult);
    }
    @DisplayName("自定義名稱")
    @ParameterizedTest()
    @CsvSource({"0, 1, 1", "10, 20, 40"})
    void test2(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second), () -> first + " + " + second + " should equal " + expectedResult);
    }
    @ParameterizedTest(name = ParameterizedTest.ARGUMENTS_WITH_NAMES_PLACEHOLDER)
    @CsvSource({"0, 1, 1", "10, 20, 50"})
    void test3(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second), () -> first + " + " + second + " should equal " + expectedResult);
    }
}
