package guide.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorRepeatedTest {
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
}
