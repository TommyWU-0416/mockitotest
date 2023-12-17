package guide.example;

import com.example.guide.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorDisableTest {
    @Disabled
    @Test
    void addFourParam() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.addFourParam(1, 2, 3, 4), "1 + 2 + 3 + 4 should equal 10");
    }
}
