package guide;

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
     * 重複 Test，沒有 name 使用 default
     */
    @RepeatedTest(2)
    void addInRepeated1() {
        System.out.println("測試");
    }

    /**
     * 重複 Test，使用內建佔位符提供的變數
     */
    @DisplayName("自定義名稱")
    @RepeatedTest(value = 2, name = "{displayName} 第 {currentRepetition} 次 總共 {totalRepetitions} 次")
    void addInRepeated2() {
        System.out.println("測試");
    }

    /**
     * 重複 Test，使用內建提供的變數
     */
    @DisplayName("預設名稱重複測試")
    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    void addInRepeated3() {
        System.out.println("測試");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"0,    1,   1", "1,  100, 101"})
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second), () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Disabled
    @Test
    void addFourParam() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.addFourParam(1, 2, 3, 4), "1 + 2 + 3 + 4 should equal 10");
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