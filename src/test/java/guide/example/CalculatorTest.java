package guide.example;

import com.example.guide.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    /**
     * @Test 通知 JUnit 該方法是要被測試的
     */
    @Test
    @DisplayName("第一個測試 1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    /**
     * 所有測試開始之前
     * 該註解 @BeforeAll 必須要是 static 的方法
     */
    @BeforeAll
    public static void beforeAllAction() {
        System.out.println("-- 初始化");
    }

    /**
     * 每一個方法開始之前
     */
    @BeforeEach
    public void beforeEachAction() {
        System.out.println("- 當前測試方法開始");
    }

    /**
     * 每一個方法開始之後
     */
    @AfterEach
    public void afterEachAction() {
        System.out.println("- 當前測試方法結束");
    }

    /**
     * 所有測試結束之後
     * 該註解 @AfterAll 必須要是 static 的方法
     */
    @AfterAll
    public static void afterAllAction() {
        System.out.println("-- 測試結束");
    }
}